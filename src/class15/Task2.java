package class15;

public class Task2 {
    public static void main(String[] args) {
        String str="asdfsdSDKJKJD123456^$&%*";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str= " +str);
        System.out.println(str.length());
    }
}
