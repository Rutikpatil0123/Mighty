package com.example.data;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PlaceDao {

    @Query("SELECT * from place")
    List<Place> getAllPlaces();



    @Insert
    void addPlace(Place place);

    @Update
    void updatePlace(Place place);

    @Delete
    void deletePlace(Place place);
}
