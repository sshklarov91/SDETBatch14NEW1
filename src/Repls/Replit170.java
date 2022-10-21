package Repls;

public class Replit170 {
    final void print(boolean a){
        System.out.println("Final method with boolean parameter");
    }
    final void print(String a){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        Replit170 ans=new Replit170();
        ans.print(true);
        ans.print("a");

    }
}
