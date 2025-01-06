package com.jstopwatch;

public class JStopWatch {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new JStopWatch().getGreeting());
    }
}
