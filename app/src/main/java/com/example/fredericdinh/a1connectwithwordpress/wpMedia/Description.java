package com.example.fredericdinh.a1connectwithwordpress.wpMedia;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Description
{

    @SerializedName("rendered")
    private String rendered;

    public void setRendered( String rendered )
    {
        this.rendered = rendered;
    }

    public String getRendered()
    {
        return rendered;
    }

    @Override
    public String toString()
    {
        return
                "Description{" +
                        "rendered = '" + rendered + '\'' +
                        "}";
    }
}