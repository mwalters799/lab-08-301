package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    //Delete city - Deletes city from the list
    public void deleteCity(City city){
        /*
        if (cities.contains(city)){
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }
         */
    }

    /*
    //Returns amount of cities in the list
    public int countCities(){
        return cities.size();
    }

     */
}
