package com.example.fredericdinh.a1connectwithwordpress.Entities.wpPost;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class WpAttachmentItem
{

    @SerializedName("href")
    private String href;

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
                "WpAttachmentItem{" +
                        "href = '" + href + '\'' +
                        "}";
    }
}