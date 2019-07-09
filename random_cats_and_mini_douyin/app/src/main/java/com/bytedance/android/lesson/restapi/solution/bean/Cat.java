package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json

    //[{"breeds":[],"id":"aa2","url":"https://cdn2.thecatapi.com/images/aa2.jpg","width":480,"height":640}]
    @SerializedName("id") private String id;
    @SerializedName("url") private  String url;
    @SerializedName("width") private int width;
    @SerializedName("height") private int height;


    public String getUrl(){
        return url;
    }

    public String getId(){
        return id;
    }

    public int getWidth(){
        return width;
    }

    public  int getHeight(){
        return height;
    }

}
