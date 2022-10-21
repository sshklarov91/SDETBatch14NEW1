package Class19;

public class Animal {
    protected String name;
    String breed;
    int age;
    double weight;

    void printInfo() {
        System.out.println("name " + name + " breed " + breed + " age " + age + " weight " + weight);
    }

    public static void main(String[] args) {
        Horse horseObject = new Horse("Spirit", "Stallion", 20, 400);
        horseObject.printInfo();
    }
}