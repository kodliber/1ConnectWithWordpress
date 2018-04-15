package com.example.fredericdinh.a1connectwithwordpress;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Asyncws extends AsyncTask<String, Integer, String>
{
    public Asyncws()
    {

    }

    @Override
    protected void onPreExecute()
    {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground( String... strings )
    {

        String retour = "";

        OkHttpClient client = new OkHttpClient();

        //On interroge WordPress via JSON
    /*
     MediaType JSON = MediaType.parse( "application/json; charset=utf-8" );
        String json = "{'user':'toto','password':'titi'}";
        */
        RequestBody jsonBody = null;

        Request request = new Request.Builder()
//                .header("Authorization", tokenEncode)
                .method( "GET", jsonBody )  // dans ce cas, GET ne demande pas de corps
                .url( "https://demo.wp-api.org/wp-json/wp/v2/posts/1" )
                .build();

        try
        {
            Response response = client.newCall( request ).execute();
            retour = response.body().string();
            Log.e( "TagOK", retour );

        } catch ( Exception e )
        {
            Log.e( "TagErr", e.getMessage() );
        }

        return retour;
    }

}
