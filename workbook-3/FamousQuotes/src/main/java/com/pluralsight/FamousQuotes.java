package com.pluralsight;
import java.util.Random;
import java.util.Scanner;
public class FamousQuotes {
    public static void main(String[] args) {



                String[] quotes = {
                        "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
                        "The purpose of our lives is to be happy. - Dalai Lama",
                        "Life is what happens when you're busy making other plans. - John Lennon",
                        "Get busy living or get busy dying. - Stephen King",
                        "You have within you right now, everything you need to deal with whatever the world can throw at you. - Brian Tracy",
                        "Believe you can and you're halfway there. - Theodore Roosevelt",
                        "The only impossible journey is the one you never begin. - Tony Robbins",
                        "Life is either a daring adventure or nothing at all. - Helen Keller",
                        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. - Ralph Waldo Emerson",
                        "The best way to predict the future is to create it. - Peter Drucker"
                };

                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                boolean continueProgram = true;

                while (continueProgram) {
                    System.out.println("Enter a number between 1 and 10 to get a quote, or enter 0 for a random quote:");
                    int choice = scanner.nextInt();

                    if (choice == 0) {
                        int randomIndex = random.nextInt(quotes.length);
                        System.out.println("Random Quote: " + quotes[randomIndex]);
                    } else {
                        // Adjust for zero-based indexing
                        choice--;
                        if (choice >= 0 && choice < quotes.length) {
                            System.out.println("Quote: " + quotes[choice]);
                        } else {
                            System.out.println("Invalid choice. Please select a number between 1 and 10.");
                        }
                    }

                    System.out.println("Do you want to see another saying? (yes/no)");
                    String response = scanner.next();
                    continueProgram = response.equalsIgnoreCase("yes");
                }

                scanner.close();
                System.out.println("Thank you for using FamousQuotes!");
            }
        }


