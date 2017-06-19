package com.example.lteixeira.marvel_app.data;

import android.media.Image;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.Date;
import java.util.List;

import retrofit2.http.Url;

/**
 * Created by lteixeira on 19/06/2017.
 */

public class Characters {

    public int id;
    public String name;
    public String description;
    public Date modified;
    public String resourceURI;
    public List<Urls> urls;
    public Images thumbnail;
    public List<Comics> comics;
    public List<Stories> stories;
    public List<Events> events;
    public List<Series> series;

}
