package com.example.fredericdinh.a1connectwithwordpress.Entities.wpPost;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Title
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
                "Title{" +
                        "rendered = '" + rendered + '\'' +
                        "}";
    }
}