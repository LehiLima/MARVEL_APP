package com.example.lteixeira.marvel_app.data;

import java.util.Date;
import java.util.List;

/**
 * Created by lteixeira on 19/06/2017.
 */

public class Stories {

    public int id;
    public String title;
    public String description;
    public String resourceURI;
    public String type;
    public Date modified;
    public Images thumbnail;
    public List<Comics> comics;
    public List<Series> series;
    public List<Characters> characters;
    public List<Creators> creators;
    public Item originalIssue;

}
