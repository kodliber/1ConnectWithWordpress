package com.example.fredericdinh.a1connectwithwordpress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fredericdinh.a1connectwithwordpress.wpMedia.WpMedia;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

public class MediaActivity extends AppCompatActivity
{
    Asyncws mediaQuery;
    TextView imgSlug;
    TextView imgSourceUrl;
    ImageView imageView;
    WpMedia wpMedia;
    Gson gson = new Gson();
    String path;


    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_media );

        imgSlug = findViewById( R.id.imgSlug );
        imgSourceUrl = findViewById( R.id.imgSourceUrl );
        imageView = findViewById( R.id.imageView );

        mediaQuery = new Asyncws( "http://vergersurbains.org/wp-json/wp/v2/media/2965" )
        {
            @Override
            protected void onPostExecute( String result )
            {
                super.onPostExecute( result );

                wpMedia = gson.fromJson( result, WpMedia.class );
                imgSlug.setText( wpMedia.getSlug() );
                path = wpMedia.getSourceUrl();
                imgSourceUrl.setText( path );
                Picasso.get().load( path ).into( imageView );
            }


        };

        mediaQuery.execute();

    }
}
