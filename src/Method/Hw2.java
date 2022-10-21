package Method;

public class Hw2 {

    public String reverse1(String str) {
        StringBuilder rev=new StringBuilder(str);
        return rev.reverse().toString();}

    public static void main(String[] args) {
        Hw2 obj =new Hw2();
        String str ="I hate java";
        System.out.println(obj.reverse1(str));
    }
    }

