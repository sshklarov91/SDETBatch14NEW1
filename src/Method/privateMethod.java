package Method;

public class privateMethod {

    private void display(String name) {
        System.out.println(name);
    }

    private void display(String name, String lastName) {
        System.out.println(name+" " + lastName);
    }

    private void display(String name, int age) {
        System.out.println(name+ " "+ age);
    }
    public static void main(String[] args) {
        privateMethod obj=new privateMethod();
        obj.display("Sergey");
        obj.display("Sergey","Shklarov");
        obj.display("Sergey",31);
    }
}







