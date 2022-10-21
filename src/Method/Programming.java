package Method;

public class Programming {
Programming(){
    System.out.println("I love Programming Languages");
}
Programming(String str){
    System.out.println("I love" + str);
}
}
class testProgramming {
    public static void main(String[] args) {
        Programming obj=new Programming();
        Programming obj1=new Programming(" Java ");
    }

}