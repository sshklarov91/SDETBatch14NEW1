package Repls;

public class Replit136 {

    private void privateMethod(){
        System.out.println("This is Private Method");
    }
    public void publicMethod(){
        System.out.println("This is Public Method");
    }
    protected void protectedMethod(){
        System.out.println("This is Protected Method");
    }
    void defaultMethod(){
        System.out.println("This is Default Method");
    }

    public static void main(String[] args) {
        Replit136 answer=new Replit136();
        answer.privateMethod();
        answer.defaultMethod();
        answer.protectedMethod();
        answer.publicMethod();
    }

}
