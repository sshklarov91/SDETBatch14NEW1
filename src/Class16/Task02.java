package Class16;

public class Task02 {
    void printEvenOdd(int num1){
        if (num1%2==0) {
            System.out.println(num1 + " is even");
        }else {
            System.out.println(+num1 + " is odd");
        }
    }
    public static void main(String[] args) {
        Task02 task02=new Task02();
        task02.printEvenOdd(10);
        task02.printEvenOdd(27);
        task02.printEvenOdd(31);
    }
}

