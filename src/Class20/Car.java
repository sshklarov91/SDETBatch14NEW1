package Class20;

class Vehicle{
    int noOfWheel;
    int topSpeed;
    public void printTopSpeed(){
        System.out.println(topSpeed);
    }
}


public class Car extends Vehicle {
    String model;
    String make;
    int year;
}

class Tesla extends Car{
void printInfo(){
    System.out.println("I am a Electrical Car");
}
}

class Toyota extends Car{
void printInfo(){
    System.out.println("I am a combustion engine car");
}
}
//class CustomCar Extends Toyota,Tesla{ not allowed because of diamond propblem.


class Tester{
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.printTopSpeed();
    }
}