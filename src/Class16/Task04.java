package Class16;

public class Task04 {
    void sayHello (String country) {
        if (country.equals("USA")){
            System.out.println("Hello");
        } else if (country.equals("Russia")){
            System.out.println("Privet");
        } else if (country.equals("Hola")){
            System.out.println("Mexico");
        }else if (country.equals("Aloha")){
            System.out.println("Hawaii");
        }
    }
    public static void main(String[] args) {
        Task04 task= new Task04();
        task.sayHello("USA");
        task.sayHello("Russia");
    }
}
