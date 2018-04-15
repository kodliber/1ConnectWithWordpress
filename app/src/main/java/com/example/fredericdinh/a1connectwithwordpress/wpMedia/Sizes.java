package com.example.fredericdinh.a1connectwithwordpress.wpMedia;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Sizes
{

    @SerializedName("thumbnail")
    private Thumbnail thumbnail;

    @SerializedName("post-thumbnail")
    private PostThumbnail postThumbnail;

    @SerializedName("medium")
    private Medium medium;

    @SerializedName("medium_large")
    private MediumLarge mediumLarge;

    @SerializedName("full")
    private Full full;

    public void setThumbnail( Thumbnail thumbnail )
    {
        this.thumbnail = thumbnail;
    }

    public Thumbnail getThumbnail()
    {
        return thumbnail;
    }

    public void setPostThumbnail( PostThumbnail postThumbnail )
    {
        this.postThumbnail = postThumbnail;
    }

    public PostThumbnail getPostThumbnail()
    {
        return postThumbnail;
    }

    public void setMedium( Medium medium )
    {
        this.medium = medium;
    }

    public Medium getMedium()
    {
        return medium;
    }

    public void setMediumLarge( MediumLarge mediumLarge )
    {
        this.mediumLarge = mediumLarge;
    }

    public MediumLarge getMediumLarge()
    {
        return mediumLarge;
    }

    public void setFull( Full full )
    {
        this.full = full;
    }

    public Full getFull()
    {
        return full;
    }

    @Override
    public String toString()
    {
        return
                "Sizes{" +
                        "thumbnail = '" + thumbnail + '\'' +
                        ",post-thumbnail = '" + postThumbnail + '\'' +
                        ",medium = '" + medium + '\'' +
                        ",medium_large = '" + mediumLarge + '\'' +
                        ",full = '" + full + '\'' +
                        "}";
    }
}