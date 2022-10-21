package Repls;

public class Replit159 {

    void print(int a, int b){
        System.out.println(a-b);
    }
    void print(int a, int b, int c){
        System.out.println(a-b-c);
    }
    void print( int a, int b, int c, int d){
        System.out.println(a-b-c-d);

    }

    public static void main(String[] args) {
        Replit159 obj=new Replit159();
        obj.print(10,5);
        obj.print(10,2,3);
        obj.print(10,2,3,5);
    }
}
