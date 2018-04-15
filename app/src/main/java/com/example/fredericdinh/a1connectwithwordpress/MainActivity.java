package com.example.fredericdinh.a1connectwithwordpress;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Cette version récupère le résultat de la tâche asynchrone
 * en définissant directement OnPostExecute en appelant le constructeur.
 * Plus simple que définir un callback.
 * Désavantages ?
 */
public class MainActivity extends AppCompatActivity
{
    TextView txtresponse;
    String res;
    Context context;
    static Asyncws netthread;

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
                txtresponse.setText( result );
            }
        };
        netthread.execute();

        // TODO essayer avec Retrofit 2
    }

}
