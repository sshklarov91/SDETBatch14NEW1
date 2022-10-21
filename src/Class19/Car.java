package Class19;

public class Car {

    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
// if a field or method has a private access modfier in a parent class child class cannot inherit it
    private String engineType;

    void printCarDetails() {
        System.out.println(" model " + model + " make " + make + " Color " + color);
    }
}
class BMW extends Car {

}
class Tesla extends Car {
}

class Toyota extends Car {
}
class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x8";
        bmw.printCarDetails();
    }
}
