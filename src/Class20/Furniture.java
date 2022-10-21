package Class20;

public class Furniture {
    String color="green";

}
class Chair extends Furniture{
    String color="red";
    void printInfo(){
        String color="black";
        System.out.println(super.color);
    }
}
class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printInfo();
    }
}