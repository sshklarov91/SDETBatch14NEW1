package Repls;

public class Replit149 {
}
class A{
     void ClassA(){
        System.out.println("Class A");
    }
}
class B extends A{
    void ClassB(){
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.ClassA();
        obj.ClassB();
    }
}