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
        String tokenPost = "hello";
        String tokenEncode = "";
        String tokenReturn = "";

        OkHttpClient client = new OkHttpClient();

        //Méthode JSON
        MediaType JSON = MediaType.parse( "application/json; charset=utf-8" );
        String json = "{'user':'toto','password':'titi'}";
        RequestBody jsonBody = null;

        Request request = new Request.Builder()
//                .header("Authorization", tokenEncode)
                .method( "GET", jsonBody )
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
