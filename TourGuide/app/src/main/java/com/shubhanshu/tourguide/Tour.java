package com.shubhanshu.tourguide;

/**
 * Created by Babu on 19-02-2018.
 */

public class Tour {
    private int tname;
    private int tplace;
    private int timageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Tour(int name, int place, int imageResourceId) {
        tname = name;
        tplace = place;
        timageResourceId = imageResourceId;
    }
    public Tour(int name, int place) {
        tname = name;
        tplace = place;
    }
    public int getplace() {
        return tplace;
    }

    public int getname() {
        return tname;
    }
    public int getImageResourceID() {
        return timageResourceId;
    }
    public boolean hasImage() {
        return timageResourceId != NO_IMAGE_PROVIDED;
    }
}
