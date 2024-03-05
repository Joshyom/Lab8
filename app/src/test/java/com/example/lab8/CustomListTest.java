package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * Create a mock city by adding a new city
     * check if our list has a city
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Regina", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    /**
     * Create a mock city by adding a new city
     * true if our list has a city
     * Then delete a city
     * false if our city has a city
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    /**
     * Create empty list as first and true if the count is 0
     * add a city
     * true if the count is 1
     */
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());
    }



}
