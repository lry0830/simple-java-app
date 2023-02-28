package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("This string is updated to trigger webhook");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
