package com.example.fredericdinh.a1connectwithwordpress.Entities.wpPost;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class CuriesItem
{

    @SerializedName("templated")
    private boolean templated;

    @SerializedName("name")
    private String name;

    @SerializedName("href")
    private String href;

    public void setTemplated( boolean templated )
    {
        this.templated = templated;
    }

    public boolean isTemplated()
    {
        return templated;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setHref( String href )
    {
        this.href = href;
    }

    public String getHref()
    {
        return href;
    }

    @Override
    public String toString()
    {
        return
                "CuriesItem{" +
                        "templated = '" + templated + '\'' +
                        ",name = '" + name + '\'' +
                        ",href = '" + href + '\'' +
                        "}";
    }
}