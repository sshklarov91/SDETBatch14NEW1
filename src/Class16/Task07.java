package Class16;

public class Task07 {

    char getGrade (int score) {
        char grade;
        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Task07 taks07=new Task07();
        System.out.println(taks07.getGrade(91));
    }
    }


