package com.pluralsight;
import java.util.Random;
import java.util.Scanner;
public class famousQuotes {

    public class FamousQuotes {
        public static void main(String[] args) {
            String[] quotes = {
            "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela\n" +
                    "The way to get started is to quit talking and begin doing. -Walt Disney\n" +
                    "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. -Steve Jobs\n" +
                    "The future belongs to those who believe in the beauty of their dreams. -Eleanor Roosevelt\n" +
                    "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey\n" +
                    "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron\n" +
                    "You may say I'm a dreamer, but I'm not the only one. I hope someday you'll join us. And the world will live as one. -John Lennon\n",
                    "You will face many defeats in life, but never let yourself be defeated.",
                    "Love the life you live. Live the life you love.\n",
                    "The greatest glory in living lies not in never falling, but in rising every time we fall.\n"
            };

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            boolean continueLoop = true;

            while (continueLoop) {
                System.out.println("Please enter a number between 1 and 10 for a quote, or 0 for a random quote:");
                int userInput = scanner.nextInt();

                if (userInput == 0) {
                    // Display a random quote
                    int randomIndex = random.nextInt(quotes.length);
                    System.out.println(quotes[randomIndex]);
                } else {
                    // Display the quote corresponding to the user's input
                    try {
                        System.out.println(quotes[userInput - 1]); // Array index is 0-based
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Invalid number. Please select a number between 1 and 10.");
                    }
                }

                // Ask if the user wants to see another quote
                System.out.println("Do you want to see another quote? (yes/no)");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    continueLoop = false;
                }
            }

            System.out.println("Thank you for using the Famous Quotes application!");
            scanner.close();
        }
    }

}
