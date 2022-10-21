package Class16;

public class Task06 {

    boolean isPrime(int number) {
        boolean isPrime=true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }else{
            isPrime=false;

        }
    return isPrime;
    }
    public static void main(String[] args) {
        Task06 task06=new Task06();
        System.out.println(task06.isPrime(11));
    }
}


