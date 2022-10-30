package Practice;
interface MyInterface {
    public void method1();
    public void method2();
}
class m implements MyInterface{

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        m obj1 =new m();
        obj1.method1();
        obj1.method2();
    }
}




