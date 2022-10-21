package Project;

public class Car {
    double carPrice;
    String color;
    void calculateSalePrice() {
    }
    static class Sedan extends Car{
       double length ;
        public void calculateSalePrice1(int length, double carPrice){
            if( length>20){
                System.out.println("Your price with the 5% discount is " + (carPrice-((carPrice*5)/100)));
            } else {
                System.out.println("Your price with the 10% discount is " + (carPrice-((carPrice*10)/100)));
            }
        }
    }
   static class Truck extends Car{
        double weight;
        public void calculateSalePrice2(int weight, double carPrice){
            if( weight>2000){
                System.out.println("Your price with the 10% discount is " + (carPrice-((carPrice*10)/100)));
            } else {
                System.out.println("Your price with the 20% discount is " + (carPrice-((carPrice*20)/100)));
            }
        }
    }
    public static void main(String[] args) {
        Sedan sedan=new Sedan();
        sedan.calculateSalePrice1(21, 50000);
        Truck truck=new Truck();
        truck.calculateSalePrice2(1999, 20000);
    }
}
