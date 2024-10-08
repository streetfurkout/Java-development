package com.pluralsight;

import java.util.Random;
import java.util.Scanner;


    public class FamousQuotes {
        public static void main(String[] args) {
            String[] quotes = {
                    "The only limit to our realization of tomorrow is our doubts of today. - Franklin D. Roosevelt",
                    "In the middle of every difficulty lies opportunity. - Albert Einstein",
                    "Life is what happens when you're busy making other plans. - John Lennon",
                    "The purpose of our lives is to be happy. - Dalai Lama",
                    "Get busy living or get busy dying. - Stephen King",
                    "You have within you right now, everything you need to deal with whatever the world can throw at you. - Brian Tracy",
                    "Believe you can and you're halfway there. - Theodore Roosevelt",
                    "The best way to predict the future is to create it. - Peter Drucker",
                    "Life is either a daring adventure or nothing at all. - Helen Keller",
                    "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. - Ralph Waldo Emerson"
            };

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            boolean continueProgram = true;

            while (continueProgram) {
                System.out.println("Enter a number between 1 and 10 to see a quote, or 0 for a random quote:");
                int userInput = scanner.nextInt();

                try {
                    if (userInput == 0) {
                        int randomIndex = random.nextInt(quotes.length);
                        System.out.println("Random Quote: " + quotes[randomIndex]);
                    } else if (userInput >= 1 && userInput <= 10) {
                        System.out.println("Quote: " + quotes[userInput - 1]);
                    } else {
                        System.out.println("Please enter a valid number between 1 and 10, or 0 for a random quote.");
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }

                System.out.print("Do you want to see another quote? (yes/no): ");
                String response = scanner.next();
                continueProgram = response.equalsIgnoreCase("yes");
            }

            scanner.close();
            System.out.println("Thank you for using the Famous Quotes application!");
        }
    }


