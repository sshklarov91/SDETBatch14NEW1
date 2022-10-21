package Repls;

public class Replit163 {
}
    class Parent {
        void method() {
            System.out.println("parent method");
        }
    }
    class child extends Parent {
        void method() {
            System.out.println("Child Method");
        }
    }
    class Main12 {
        public static void main(String[] args) {
        Parent obj= new child();
        obj.method();
        }
    }


