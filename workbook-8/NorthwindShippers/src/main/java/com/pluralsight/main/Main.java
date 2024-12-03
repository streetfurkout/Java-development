package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2 ){
            System.out.println("Please enter a valid username and password");
            System.exit(1);
        }

        String username = args[0];
        String password = args [1];


    }
}
