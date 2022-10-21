package Method;

public class TestClass {
    public static void main(String[] args) {
        area obj = new area();
        obj.Area(5);
        obj.Area(5,10);
        obj.Area(5,10,8);
    }
}
class area{
    void Area (double length, int height){
        System.out.println(length*height);
    }
    void Area(int length){
        System.out.println(length*length);
    }
    void Area(int length, int width, int height){
        System.out.println(length*width*height);
    }
}