package Class23;

public interface Person {
    void eat();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee,Person{
    void creatRepl();
}
class Asghar implements SyntaxEmployee {


    @Override
    public void eat() {
        System.out.println("Likes to eat grilled fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Batch14");
    }

    @Override
    public void creatRepl() {
        System.out.println("Create easy Repls");
    }
}