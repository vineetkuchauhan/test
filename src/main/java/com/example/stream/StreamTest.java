package com.example.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1000);
        for (int i = 0; i < 100; i++) {
            int lastvalue = list.get(i);
            list.add(lastvalue + 1000);
        }

        List<Integer> serailList = new ArrayList<Integer>();
        list.stream().filter(p -> p > 3000).forEach(s -> {
            serailList.add(s);
           // System.out.println(serailList.get(s));
            System.out.println(Thread.currentThread().getName());
        });

        System.out.println("Serial Stream --> "+serailList);

        List<Integer> parallelList = new ArrayList<Integer>();
        list.parallelStream().filter(p -> p > 3000).forEach(p -> {
            parallelList.add(p);
            //System.out.println(serailList.get(p));
            System.out.println(Thread.currentThread().getName());
        });

        System.out.println("Parallel Stream --> "+parallelList);
    }
}
