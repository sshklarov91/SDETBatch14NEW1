package Repls;

public class StoreProduct {
    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock) {
        this.lable = lable;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    StoreProduct(String lable, double price, int stock) {
        this.lable = lable;
        this.price = price;
        this.stock = stock;
        this.category = "misc";
        this.hasExpiration = false;
    }

    StoreProduct(String lable, double price) {
        this.lable = lable;
        this.price = price;
        this.stock = 0;
    }

    public void displayMethod() {
        System.out.println(lable + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}

   class Main2 {
public static void main(String[] args){
        StoreProduct obj1=new StoreProduct("Eggs",3.0,"Produce",true,10);
        obj1.displayMethod();
        StoreProduct obj2=new StoreProduct("Paper Towels",2.0,"misc",false,24);
        obj2.displayMethod();
        StoreProduct obj3=new StoreProduct("Paper Towels",2.0,0);
        obj3.displayMethod();

        }
}
