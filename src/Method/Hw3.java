package Method;

public class Hw3 {
    private String vowels(String str) {
        return str.replaceAll("[^aeiou]", "");
    }

    public static void main(String[] args) {
        Hw3 obj=new Hw3();
        String str="I Hate Java";
        System.out.println(obj.vowels(str));
    }

}
