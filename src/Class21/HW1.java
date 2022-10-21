package Class21;
//Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.
public class HW1 {

}
class degree {

    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
    class Bachelors extends degree{
    }
    class  Masters extends degree{
        void getPrerequisite() {
            System.out.println("To get a degree you need high school diploma #2");
        }

        public static void main(String[] args) {
            degree obj1=new degree();
            obj1.getPrerequisite();
            Bachelors obj2=new Bachelors();
            obj2.getPrerequisite();
            Masters obj3=new Masters();
            obj3.getPrerequisite();
        }
}


