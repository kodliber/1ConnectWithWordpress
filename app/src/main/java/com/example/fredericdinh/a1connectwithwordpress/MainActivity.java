package com.example.fredericdinh.a1connectwithwordpress;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

/**
 * Essai de connexion à un endpoint de Wordpress
 *
 * @txtresponse le textView qui affiche le résultat de la requete
 */

public class MainActivity extends AppCompatActivity implements Asyncws.Kallbak
{
    TextView txtresponse;
    String res;
    Context context;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        String test = "init";
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        context = this;

        txtresponse = findViewById( R.id.txtResponse );

        // un essai avec okHTTP
        Asyncws netthread = new Asyncws( this, this );

        try
        {
            test = netthread.execute().get(); // s'agissant d'un thread asynchrone, le résultat est confié à un callback implémenté plus bas
        } catch ( InterruptedException e )
        {
            e.printStackTrace();
        } catch ( ExecutionException e )
        {
            e.printStackTrace();
        }

//        txtresponse.setText( test );
        Log.e( "TagOK", test );


        // TODO essayer avec Retrofit 2
    }

    /**
     * Callback de la classe Asyncws
     *
     * @param output résultat de la requête
     */
    @Override
    public void jaifini( String output )
    {
        if ( output != null )
        {
            txtresponse.setText( output );
            Log.e( "Tag", output );

        } else
        {
            Log.e( "AIE", "bug" );
        }
    }
}
