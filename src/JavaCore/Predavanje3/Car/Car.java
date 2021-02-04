package JavaCore.Predavanje3.Car;

public class Car {
    String make;
    String model;
    int NumDoors;
    static int wheels = 4;

    public static void HowManyWheels() {
        System.out.println(wheels);
    }

    void printDetails() {
        System.out.println("Make " + make);
        System.out.println("Model " + model);
        System.out.println("Number of doors " + NumDoors);
        System.out.println("Number of wheels "+wheels);
    }

    public Car() {
        model = "I5";
        make = "BMW";
        NumDoors = 2;
    }
}
