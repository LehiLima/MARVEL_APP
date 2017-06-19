package com.example.lteixeira.marvel_app.data;

import java.util.Date;
import java.util.List;

/**
 * Created by lteixeira on 19/06/2017.
 */

public class Comics {

    public int id;
    public int digitalId;
    public String title;
    public double issueNumber;
    public String variantDescription;
    public String description;
    public Date modified;
    public String isbn;
    public String upc;
    public String diamondCode;
    public String ean;
    public String issn;
    public String format;
    public int pageCount;
    public List<TextObject> textObjects;
    public String resourceURI;
    public List<Urls> urlses;
    public Item series;
    public List<Item> variants;
    public List<Item> collection;
    public List<Item> collectedIssues;
    public List<IndustryDate> dates;
    public List<Price> prices;
    public Images thumbnail;
    public List<Images> images;
    public List<Creators> creators;
    public List<Characters> characters;
    public List<Stories> stories;
    public List<Events> events;

}
