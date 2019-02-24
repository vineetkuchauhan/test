package com.example.hr.ds;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedStringTest {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int l = s.length();
        int mod = (int) (n % l);
        int occurance = (int) (n / l);
        char[] array = s.toCharArray();
        int repeated_a = 0;
        int c = 0;

        for (int i = 0; i < l; i++) {
            if (array[i] == 'a') {
                if (i < mod)
                    c = c +1;
                repeated_a = repeated_a + 1;
            }
        }

        return (occurance * repeated_a + c);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "bca";
        long n = 999999999;

        long l = repeatedString(s,n);

        System.out.println(l);
    }
}

