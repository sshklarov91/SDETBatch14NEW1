package Class17;

public class Students {
    String name;
    String id;
   static int numberOfStudent;

    public static void main(String[] args) {

        Students roman = new Students();
        roman.id = "1";
        roman.name = "Ivan";
        Students.numberOfStudent++;

        Students sonamKapor = new Students();
        sonamKapor.id = "2";
        sonamKapor.name = "Sonam";
        Students.numberOfStudent++;
        System.out.println(numberOfStudent);
        System.out.println(numberOfStudent);
    }
}