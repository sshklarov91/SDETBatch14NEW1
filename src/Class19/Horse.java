package Class19;

public class Horse extends Animal {
    String name;
    String breed;
    int age;
    double weight;

    public Horse(String name, String breed, int age, double weigth){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;

    }


    public static void main(String[] args) {
        Horse horseObject=new Horse("Spirit","Stallion",20,400);
        horseObject.printInfo();
    }

    public void printInfo() {
    }
}
