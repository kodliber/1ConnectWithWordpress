package com.example.fredericdinh.a1connectwithwordpress.Entities.wpPost;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Excerpt
{

    @SerializedName("rendered")
    private String rendered;

    @SerializedName("protected")
    private boolean jsonMemberProtected;

    public void setRendered( String rendered )
    {
        this.rendered = rendered;
    }

    public String getRendered()
    {
        return rendered;
    }

    public void setJsonMemberProtected( boolean jsonMemberProtected )
    {
        this.jsonMemberProtected = jsonMemberProtected;
    }

    public boolean isJsonMemberProtected()
    {
        return jsonMemberProtected;
    }

    @Override
    public String toString()
    {
        return
                "Excerpt{" +
                        "rendered = '" + rendered + '\'' +
                        ",protected = '" + jsonMemberProtected + '\'' +
                        "}";
    }
}