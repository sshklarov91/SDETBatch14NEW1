package Class18;

import java.util.Scanner;

public class empTester {
    public static void main(String[] args) {
        Employee josh=new Employee("josh","IT",
            1200000,25);
        josh.printSalary();
        josh.calculatePrintTax();

        Scanner scanner=new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder("str");
        String str=new String("value");
    }
}
