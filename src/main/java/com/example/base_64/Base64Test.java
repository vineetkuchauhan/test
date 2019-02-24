package com.example.base_64;

import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) {

        String[] keys = {
                "100004" + ":" + "12345678" + ":" + "test-asset-id-1",
                "100004" + ":" + "12345678" + ":" + "test-asset-id-2",
                "100004" + ":" + "12345678" + ":" + "test-asset-id-3",
                "100004" + ":" + "12345678" + ":" + "test-asset-id-4",
                "100004" + ":" + "12345678" + ":" + "test-asset-id-5",
                "100004" + ":" + "12345678" + ":" + "test-asset-id-6"
        };

        for (int i = 0; i < keys.length; i++) {
            System.out.println(Base64.getEncoder().encodeToString(keys[i].getBytes()));
        }
        //String str = Base64.getEncoder().encodeToString(key.getBytes());
    }
}
