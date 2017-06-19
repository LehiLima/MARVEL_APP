package com.example.lteixeira.marvel_app.data;

import java.util.Date;
import java.util.List;

/**
 * Created by lteixeira on 19/06/2017.
 */

public class Events {

    public int id;
    public String title;
    public String description;
    public String resourceURL;
    public List<Urls> urlses;
    public Date modified;
    public Date start;
    public Date end;
    public Images thumbnail;
    public List<Comics> comics;
    public List<Stories> stories;
    public List<Series> series;
    public List<Characters> characters;
    public List<Creators> creators;
    public Item next;
    public Item previous;
}
