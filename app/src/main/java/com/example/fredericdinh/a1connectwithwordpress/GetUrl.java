package com.example.fredericdinh.a1connectwithwordpress;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetUrl
{
    // connexion au site de test de l'API wordpress
    OkHttpClient okHttpClient = new OkHttpClient();

    String run(String url) throws IOException
    {
        Response response = null;
        Request request = new Request.Builder().url(url).build();
        try
        {
            response = okHttpClient.newCall(request).execute();
            return response.body().string();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    return String.valueOf(response);
    }

/*    public static void main (String[] args) throws IOException
    {
        GetUrl example = new GetUrl();
        String response = example.run("https://demo.wp");
        System.out.println(response);
    }*/
}
