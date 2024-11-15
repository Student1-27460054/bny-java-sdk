package com.bny;

public class App {
    // A method that returns a simple SDK message
    public String getMessage() {
        return "Hello from BNY SDK!";
    }

    // Main method (optional for SDK projects)
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}
