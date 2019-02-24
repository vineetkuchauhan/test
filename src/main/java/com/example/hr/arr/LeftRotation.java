package com.example.hr.arr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int x = d;
        int j = 0;
        int l = a.length;
        int s = (l - d);
        int[] temp = new int[l];

        for(int i = 0; i < l; i++){

            if(d < l){
                temp[i] = a[d];
                d++;
            }

            if(j < x){
                temp[s] = a[j];
                s++;
                j++;
            }
        }

        return temp;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = {1,2,3,4,5};
        int d = 4;
        int[] temp = rotLeft(arr, d);

        System.out.println(temp.toString());
    }
}

