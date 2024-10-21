package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOverTimeHours() {
        return Math.max(0, hoursWorked-40);
    }
    public double getTotalPay() {
        double regularHours = getRegularHours();
        double overtimeHours = getOverTimeHours();
        return (regularHours * payRate) + (overtimeHours * payRate *1.5);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
