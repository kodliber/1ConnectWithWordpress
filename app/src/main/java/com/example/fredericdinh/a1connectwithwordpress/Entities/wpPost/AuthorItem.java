package com.example.fredericdinh.a1connectwithwordpress.Entities.wpPost;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AuthorItem
{

    @SerializedName("href")
    private String href;

    @SerializedName("embeddable")
    private boolean embeddable;

    public void setHref( String href )
    {
        this.href = href;
    }

    public String getHref()
    {
        return href;
    }

    public void setEmbeddable( boolean embeddable )
    {
        this.embeddable = embeddable;
    }

    public boolean isEmbeddable()
    {
        return embeddable;
    }

    @Override
    public String toString()
    {
        return
                "AuthorItem{" +
                        "href = '" + href + '\'' +
                        ",embeddable = '" + embeddable + '\'' +
                        "}";
    }
}