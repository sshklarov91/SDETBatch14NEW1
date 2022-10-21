package Class21;
//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class HW2 {
}
class CreditCard {
    int balance;
    double interest;

    double calculateInterest(int balance) {
        interest = balance * 14.99;
        //System.out.println(interest);
        return interest;
    }
}
    class visa extends CreditCard{

    }
    class ax extends CreditCard{
    @Override
        double calculateInterest(int balance) {
            interest = balance * 29.99;
            return interest;
        }
        public static void main(String[] args) {
            CreditCard obj1=new CreditCard();
            System.out.println(obj1.calculateInterest(20000));
            visa obj2=new visa();
            System.out.println(obj2.calculateInterest(30000));
            ax obj3=new ax();
            System.out.println(obj3.calculateInterest(40000));

        }
}
