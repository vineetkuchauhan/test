package com.example.memory;
public class MemoryTest {
    public static void main(String arg[]) throws Exception{
        for(int i = 0; i< 99999999; i++){
            new String("i");
           // Thread.sleep(500);
            System.out.println(i);
        }
    }
}
