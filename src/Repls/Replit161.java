package Repls;

public class Replit161 {

    private void m1(String a) {
        System.out.println("Private m1 Method");
    }

    private void m1(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Replit161 obj = new Replit161();
        obj.m1("Test");
        obj.m1(10, 5);
    }
}