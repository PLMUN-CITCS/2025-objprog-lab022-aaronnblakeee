class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Set the attributes of myCar
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the displayInfo method to print car information
        myCar.displayInfo();
    }
}
