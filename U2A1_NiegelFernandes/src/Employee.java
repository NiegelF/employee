/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *employeeIdNumber;
firstName;
lastName;
annualSalary;
startDate.

 * @author Niegel
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private double annualSalary;
    private Date startDate;

    public Employee(int employeeID, String firstName, String lastName, double annualSalary, Date startDate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.startDate = startDate;
    }

    // Getter methods
    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public Date getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Employee ID: " + employeeID + ", Name: " + firstName + " " + lastName +
               ", Salary: " + annualSalary + ", Start Date: " + dateFormat.format(startDate);
    }
}