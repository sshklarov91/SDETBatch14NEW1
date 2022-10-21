package Class22;

import Class22.CollegeStudent;
import Class22.SchoolStudent;
import Class22.Student;
import Class22.SyntaxStudent;

public class Task1Tester {
    public static void main(String[] args) {
        Student[]students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student tester:students){
            tester.eat();
            tester.sleep();
            tester.study();
        }
    }
}
