package com.example.importantquestions.ooppract;
public class ConstructorOverLoading {
    // Fields (attributes)
    private String make;
    private String model;
    private int year;
    private double price;

    // 1. Default constructor
    public ConstructorOverLoading() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 2023;
        this.price = 0.0;
    }

    // 2. Parameterized constructor (partial parameters)
    public ConstructorOverLoading(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 2023;  // Default year
        this.price = 0.0;  // Default price
    }

    // 3. Parameterized constructor (all parameters)
    public ConstructorOverLoading(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // 4. Copy constructor
    public ConstructorOverLoading(ConstructorOverLoading otherCar) {
        this.make = otherCar.make;
        this.model = otherCar.model;
        this.year = otherCar.year;
        this.price = otherCar.price;
    }

    // Getter methods
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    // Setter methods
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("-------------------");
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Using default constructor
        ConstructorOverLoading car1 = new ConstructorOverLoading();
        System.out.println("Car 1 (Default Constructor):");
        car1.displayInfo();

        // Using partial parameterized constructor
        ConstructorOverLoading car2 = new ConstructorOverLoading("Toyota", "Camry");
        System.out.println("Car 2 (Partial Parameters):");
        car2.displayInfo();

        // Using full parameterized constructor
        ConstructorOverLoading car3 = new ConstructorOverLoading("Honda", "Accord", 2022, 27500.99);
        System.out.println("Car 3 (Full Parameters):");
        car3.displayInfo();

        // Using copy constructor
        ConstructorOverLoading car4 = new ConstructorOverLoading(car3);
        System.out.println("Car 4 (Copy of Car 3):");
        car4.displayInfo();

        // Modifying car4 to show it's a separate object
        car4.setYear(2023);
        car4.setPrice(28500.50);
        System.out.println("Car 4 After Modification:");
        car4.displayInfo();
        System.out.println("Car 3 (Original Unchanged):");
        car3.displayInfo();
    }
}