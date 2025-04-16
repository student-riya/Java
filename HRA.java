public class Employee {

    // Employee attributes
    private String name;
    private int id;
    private String dateOfBirth;
    private String designation;
    private double basicSalary;

    // Constructor to initialize employee details
    public Employee(String name, int id, String dateOfBirth, String designation, double basicSalary) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    // Method to calculate HRA (20% of basic salary)
    private double calculateHRA() {
        return 0.2 * basicSalary;
    }

    // Method to calculate DA (70% of basic salary)
    private double calculateDA() {
        return 0.7 * basicSalary;
    }

    // Method to calculate Net Salary
    public double calculateNetSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + calculateNetSalary());
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Example: Creating an Employee object
        Employee emp = new Employee("John Doe", 101, "1990-05-12", "Software Engineer", 50000.00);

        // Display employee details
        emp.displayEmployeeDetails();
    }
}
