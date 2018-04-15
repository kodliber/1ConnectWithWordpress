package com.example.fredericdinh.a1connectwithwordpress;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.fredericdinh.a1connectwithwordpress.Entities.wpPost.Wppost;
import com.google.gson.Gson;

/**
 * Cette version récupère le résultat de la tâche asynchrone
 * en définissant directement OnPostExecute en appelant le constructeur.
 * Plus simple que définir un callback.
 * Désavantages ?
 * TODO essayer avec Retrofit 2
 */
public class MainActivity extends AppCompatActivity
{
    TextView postSlug;
    TextView postTitle;
    TextView postContent;
    String res;
    Context context;
    static Asyncws netthread;
    Gson jsonObject = new Gson();
    Wppost wp = null;


    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        context = this;
        postSlug = findViewById( R.id.txtSlug );
        postTitle = findViewById( R.id.txtTitle );
        postContent = findViewById( R.id.txtContent );

        // un essai avec okHTTP
//        netthread = new Asyncws("http://vergersurbains.org/wp-json/wp/v2/media/2994")
        netthread = new Asyncws("https://demo.wp-api.org/wp-json/wp/v2/posts/1")
        {
            protected void onPostExecute( String result )
            {
                wp = jsonObject.fromJson( result, Wppost.class );
                postSlug.setText( "Slug : " + wp.getSlug().toString() );
                postTitle.setText( "Titre : " + wp.getTitle().getRendered().toString() );
                postContent.setText( "Corps : " + wp.getContent().getRendered().toString() );
            }
        };
        netthread.execute();


    }


}
