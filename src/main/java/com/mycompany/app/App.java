package com.mycompany.app;

/**
 * Hola mundo!
 */
public class App
{

    private final String message = "Hola mundo!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
