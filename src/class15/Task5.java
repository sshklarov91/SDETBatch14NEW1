package class15;

public class Task5 {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("abc");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The String is Palidrome");
        } else {
            System.out.println("This string is not Palindrome");
        }
    }
}
