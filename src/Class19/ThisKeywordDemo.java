package Class19;

public class ThisKeywordDemo {
    String srt="Red";

    void print(){
        String str="Blue";
        System.out.println(str);
        System.out.println(this.srt);
    }

    public static void main(String[] args) {
        new ThisKeywordDemo().print();
    }
}
