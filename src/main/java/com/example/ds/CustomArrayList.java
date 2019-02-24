package com.example.ds;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList {

    Object[] intial_capacity = {};
    Object[] element_data = {};
    int size = 0;
    int capacity = 16;



    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(0);
        l.get(0);


       // l.addAll(new ArrayList());
    }

    public CustomArrayList(){
        this.element_data = intial_capacity;
    }
    public boolean add(Object object) {
        boolean status = false;

        if(size == 0) {
            element_data[size] = object;
            size++;
            status = true;
        }

        return status;
    }

    public Object get(int index){
        if(size > 0){
            //return objects[index];
        }

        return null;
    }
}
