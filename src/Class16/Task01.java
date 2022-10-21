package Class16;

public class Task01 {
    void printLarger(int num1, int num2){
        if (num1>num2) {
            System.out.println("Number 1 is larger");
        }else if ( num2>num1){
            System.out.println("Number 2 is larger");
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Task01 task01=new Task01();
        task01.printLarger(10,20);
        task01.printLarger(20,10);
        task01.printLarger(30,30);
    }
}
