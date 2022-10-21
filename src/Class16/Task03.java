package Class16;

import java.util.Locale;

public class Task03 {

    void printPalindrome(String str){
        str=str.toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The String is a Palidrome");
        } else {
            System.out.println("This string is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Task03 task= new Task03();
        task.printPalindrome("Car");

    }
}




