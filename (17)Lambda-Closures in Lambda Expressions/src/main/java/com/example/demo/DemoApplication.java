package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        int x = 30;
        int y = 40;
        doPerate(x, n -> System.out.println(n + y));
    }

    private static void doPerate(int i, Operation o) {
        o.operate(i);
    }
}
