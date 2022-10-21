package class15;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Today is java class");
        StringBuffer stringBuffer=new StringBuffer("Toyda is java class");

        String str="Java is very easy";
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);


    }
}
