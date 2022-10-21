package Repls;

class CarObject {
    String model;
    double price;
    int quantity;

    CarObject(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    void carStockValue() {
        double stockValue = quantity * price;
        System.out.println(model + "Stock Value " + stockValue);
    }
}
    class Main4 {
        public static void main(String[] args) {
            new CarObject("Toyota 2019 ",250000,10).carStockValue();
            new CarObject("BMW 2019 ",10883,60).carStockValue();

        }
    }



