package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



    public class FormatDates {
        public static void main(String[] args) {
            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();

            // Define the different formats
            DateTimeFormatter format1 = DateTimeFormatter.ofPattern("09/05/2021");
            DateTimeFormatter format2 = DateTimeFormatter.ofPattern("2021-09-05");
            DateTimeFormatter format3 = DateTimeFormatter.ofPattern("September 5, 2021", Locale.ENGLISH);
            DateTimeFormatter format4 = DateTimeFormatter.ofPattern("Sunday, Sep 5, 2021 10:02").withZone(ZoneId.of("GMT"));

            // Display the current date and time in different formats
            System.out.println(get.DateTime.format(format1));
            System.out.println(get.Time.format(format2));
            System.out.println(get.Time.format(format3));
            System.out.println(format4.format(currentDateTime.atZone(ZoneId.systemDefault())));
        }
    }

// I need to change the dates with user`s input and I can do it with using getter.
// I am trying but unfortunately can`t do it for now.
// So, later on I will try to do it.
