package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList cityList = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");
        cityList.addCity(edmonton);
        cityList.addCity(calgary);

        //test delete
        cityList.deleteCity(edmonton);
        assertFalse(cityList.hasCity(edmonton));

        //assert throws exception when deleting something not already in the list
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(edmonton);
        });
    }

    /*
    @Test
    public void testCountCities(){
        CustomList cityList = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");
        int correctCount = 2;
    }
     */
}
