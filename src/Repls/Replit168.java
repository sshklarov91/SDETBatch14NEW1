package Repls;

public class Replit168 {
    final String a(String z){
        String newStr="";
        for(int i=z.length()-1; i>0;i--){
            newStr+=z.charAt(i);

        }
        return newStr;
    }

    public static void main(String[] args) {
        Replit168 ans=new Replit168();
        System.out.println(ans.a(" hello"));
    }
}
