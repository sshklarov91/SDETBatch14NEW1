package Method;

public class staticMethod {

    static void print(){

    }
static void print(int a){
        System.out.println(a);
}
static void print(int a, int b){
        System.out.println(a+b);
}
static void print(int a, double b){
        System.out.println(a+b);
}
}
class testStatic{
    public static void main(String[] args) {
        staticMethod obj=new staticMethod();
        staticMethod.print(2);
        staticMethod.print(2,6);
        staticMethod.print(5,5.4);
    }
}
