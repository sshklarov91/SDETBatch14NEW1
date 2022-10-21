package Repls;

public class Dog {
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    public Dog(String name,double weight) {
        this.dogName=name;
        this.dogWeight=weight;

}
    public void printInfo() {
        System.out.println(dogName + dogBreed + " " +  dogWeight);
    }
    public static void main(String[] args) {
        Dog obj1=new Dog("Tarzan ",50.0);
        Dog obj2=new Dog("Lucy ",10.0);
        obj1.printInfo();
        obj2.printInfo();

    }
}
