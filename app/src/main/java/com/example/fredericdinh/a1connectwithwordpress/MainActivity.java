package com.example.fredericdinh.a1connectwithwordpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity
{
    TextView txtresponse;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetUrl urlReader = new GetUrl();
        String response = null;

        // TODO Fred à mettre dans une methode asynchrone asynctask
        try
        {
            response = urlReader.run("https://demo.wp-api.org/wp-json/");
            txtresponse = findViewById(R.id.txtResponse);
            txtresponse.setText(response.toString());
        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
