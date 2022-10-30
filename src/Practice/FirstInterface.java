package Practice;

public interface FirstInterface {
    void firstMethod();
}
interface SecondInterface{
    void secondMethod();
}
class mn implements FirstInterface,SecondInterface{

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args) {
        mn obj1 =new mn();
        obj1.firstMethod();
        obj1.secondMethod();
    }
}