package com.example.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomArrayListTest {

    @Test
    public void add(){
        CustomArrayList customArrayList = new CustomArrayList();
        boolean status = customArrayList.add("vineet");

        assertEquals(true, status);
    }

    @Test
    public void get()
    {

    }
}
