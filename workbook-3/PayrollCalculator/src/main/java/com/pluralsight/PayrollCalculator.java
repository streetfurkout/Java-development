package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file employee file to process:");
        String employeeFile = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to create:");
        String payrollFile = scanner.nextLine();

        try {
            writePayrollFile(employeeFile, payrollFile);
            System.out.println("Payroll file '" + payrollFile + "' created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();




        }
    }
}
