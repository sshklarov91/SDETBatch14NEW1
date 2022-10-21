package Repls;

public class ShoppingStore {
    String item;
    double price;
    double quantity;

    ShoppingStore(String item, double price, double quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    double itemTotalPrice() {
        double totalPrice = quantity * price;
        System.out.println(item + " Total Value " + totalPrice);
        return totalPrice;
    }

}
class Main5 {
    public static void main(String[] args) {
        double m1 = new ShoppingStore("Blanket", 9.998, 10).itemTotalPrice();
        double m2 = new ShoppingStore("Mattress",43.918,10).itemTotalPrice();
        System.out.println("Total purchased " +(m1+m2)+ " Today");

    }
}

