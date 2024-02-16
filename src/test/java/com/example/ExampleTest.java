package com.example;

import org.junit.jupiter.api.Test;

class ExampleTest {

    boolean shared = false;

    @Test
    void test1(){
        if(!shared) {
            System.out.println("Hello world 1");
        } else {
            System.out.println("World was already greeted");
        }
        shared = true;

    }

    @Test
    void test2(){
        if(!shared) {
            System.out.println("Hello world 2");
        } else {
            System.out.println("World was already greeted");
        }
        shared = true;
    }
}
