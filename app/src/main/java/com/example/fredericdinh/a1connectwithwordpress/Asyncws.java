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
    private Context c;
    public Kallbak kallbak = null; // l'interface

    public Asyncws( Kallbak callbackmethod, Context context )
    {
        c = context;
        kallbak = callbackmethod;
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
//        RequestBody jsonBody = RequestBody.create( JSON, json );
        RequestBody jsonBody = null;

        //Méthode POST
        FormBody.Builder formBuilder = new FormBody.Builder()
                .add( "user", "toto" )
                .add( "password", "titi" );

        RequestBody requestBody = formBuilder.build();

        //Méthode GET
        HttpUrl.Builder urlBuilder =
                HttpUrl.parse( "http://parissansvoiture.fr/wp-json/wp/v2/posts" ).newBuilder();
        urlBuilder.addQueryParameter( "user", "toto" );
        urlBuilder.addQueryParameter( "password", "titi" );

        String urlGet = urlBuilder.build().toString();

/*
        try {
            tokenEncode = encodeSha256(tokenPost);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
*/

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

     /*       if ( response.isSuccessful() )
            {
                Headers headers = response.headers();
                tokenReturn = headers.get( "Authorization" );

                if ( tokenEncode.equals( tokenReturn ) )
                {
                    retour = response.body().string();
                }
            }
*/

        } catch ( Exception e )
        {
            Log.e( "TagErr", e.getMessage() );
        }

        return retour;
    }

    @Override
    protected void onPostExecute( String s )
    {
        super.onPostExecute( s );
        kallbak.jaifini( s );

        Toast.makeText( c, "retour =" + s, Toast.LENGTH_LONG ).show();
    }

    public interface Kallbak
    {
        void jaifini( String output );
    }

}
