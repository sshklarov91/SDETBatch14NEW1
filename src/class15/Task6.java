package class15;

public class Task6 {
    public static void main(String[] args) {

        String str1="Python";
        String str2="Java";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
    }
}
