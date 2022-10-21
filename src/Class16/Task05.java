package Class16;

public class Task05 {

    String createEmail(String firstName, String lastName, String emailType) {
        return firstName+lastName+emailType + ".com ";
    }

    public static void main(String[] args) {
        Task05 task05= new Task05();
        String fullEmail=task05.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
    }
}

