package Repls;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;




    Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Car(String make, String model, int topSpeed, double price) {
        this.numberOfDoors=4;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Car(int numberOfDoors, int topSpeed, double price) {
        this.make = "unknown";
        this.model ="unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Car(String make, String model, int numberOfDoors) {
        this.topSpeed = 90;
        this.price = 0;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    void displayMethod() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
}

class Main1 {
    public static void main(String[] args){
        Car obj1=new Car("Toyota","Prius",4,120,30000.0);
        obj1.displayMethod();
        Car obj2=new Car("Toyota","Prius",120,30000.0);
        obj2.displayMethod();
        Car obj3=new Car(4,120,30000.0);
        obj3.displayMethod();
        Car obj4=new Car("Toyota","Prius",4);
        obj4.displayMethod();
    }

}









