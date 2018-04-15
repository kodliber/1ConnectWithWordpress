package com.example.fredericdinh.a1connectwithwordpress;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Dans cette version,
 * la récupération du résultat de la tâche asynchrone se fait avec un callback.
 * Nécessite l'implétementation de l'interface.
 */
public class MainActivity extends AppCompatActivity implements Asyncws.Kallbak
{
    TextView txtresponse;
    Context context;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        context = this;
        txtresponse = findViewById( R.id.txtResponse );

        // un essai avec okHTTP
        Asyncws netthread = new Asyncws( this, this );
        netthread.execute(); // s'agissant d'un thread asynchrone, le résultat est confié à un callback implémenté plus bas

        // TODO essayer avec Retrofit 2
    }

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
