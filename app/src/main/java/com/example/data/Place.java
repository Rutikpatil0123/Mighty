package com.example.data;

//import android.arch.persistence.room.ColumnInfo;
//import android.arch.persistence.room.Entity;
//import android.arch.persistence.room.Ignore;
//import android.arch.persistence.room.PrimaryKey;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "place")
public class Place {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "location")
    private String location;


    @ColumnInfo(name = "date")
    private String date;


    @ColumnInfo(name = "Desc")
    private String Desc;

    @ColumnInfo(name = "image_link")
    private String image_link;

     Place(int id, String name, String location, String date, String desc, String image_link) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.Desc = desc;
        this.image_link = image_link;
    }

     @Ignore
     Place(String name, String location, String date, String desc, String image_link) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.Desc = desc;
        this.image_link = image_link;
    }
    Place(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }
}
