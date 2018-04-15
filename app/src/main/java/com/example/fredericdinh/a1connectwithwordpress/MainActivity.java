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
    TextView txtresponse;
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
        txtresponse = findViewById( R.id.txtResponse );

        // un essai avec okHTTP
        netthread = new Asyncws()
        {
            protected void onPostExecute( String result )
            {
                wp = jsonObject.fromJson( result, Wppost.class );
                txtresponse.setText( wp.getSlug().toString() );
            }
        };
        netthread.execute();


    }


}
