package Project;

public interface ShapeTester {
    public static void main(String[] args) {
        Shape shape[]={new circle(),new circle.square()};
        for(Shape tester:shape){
            tester.calculateArea();
            tester.calculatePerimiter();
        }
    }
}
