package Repls;

public class Replit162 {
    static void m1() {
        System.out.println("static method without parameter");
    }

    static void m1(int a) {
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        Replit162 obj = new Replit162();
        obj.m1();
        obj.m1(10);
    }
}

