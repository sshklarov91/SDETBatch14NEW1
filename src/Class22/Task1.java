package Class22;

public class Task1 {
}
class Student{
    public void sleep(){
        System.out.println("Student sleeps");
    }
    public void study(){
        System.out.println("Student Studies");
    }
    public void eat(){
        System.out.println("Student Eats");
    }
}

class SyntaxStudent extends Student{
public  void  sleep(){
    System.out.println("Student Sleeps All The Time");
}
}
class CollegeStudent extends Student{
    public void study(){
        System.out.println("Student Never Studies");
    }
}
class SchoolStudent extends Student {
    public void eat() {
        System.out.println("Student Eats Only Junk Food");
    }
}