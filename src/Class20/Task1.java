package Class20;

public class Task1 {



    public static void main(String[] args) {
    Student josh =new Student("Josh"," 123 I hate java street ");
    josh.displayInfo();
    }
    }
class Student {
    String name;
    String address;
    public Student (String name, String address){
            this.name=name;
            this.address=address;
    }

    void displayInfo(){
        System.out.println("name "+ name + " address " + address);
    }
}