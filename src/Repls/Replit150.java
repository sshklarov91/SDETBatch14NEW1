package Repls;

public class Replit150 {
}
class Person{
    void name(){
        System.out.print("Joe ");
    }
    void lastName(){
        System.out.print("Smith ");
    }
    void age(){
        System.out.print(35+ " ");
    }
}
class Employee1 extends Person{
    void salary(){
        System.out.print(35000+ " ");
    }
}
class Student extends Employee1{
    void name(){
        System.out.print("Adam ");
    }
    void grade(){
        System.out.print(15+ " ");
    }
    void age(){
        System.out.print(10+ " ");
    }
}
class Retiree extends Student{
    void name(){
        System.out.print("Frank ");
    }
    void SeniorActivity(){
        System.out.print("Tour");
    }

    public static void main(String[] args) {
        Employee1 e=new Employee1();
        e.name();
        e.lastName();
        e.age();
        e.salary();
        System.out.println("");
        Student s=new Student();
        s.name();
        s.lastName();
        s.age();
        s.grade();
        System.out.println("");
        Retiree r = new Retiree();
        r.name();
        r.lastName();
        r.grade();
        r.SeniorActivity();
    }
}

