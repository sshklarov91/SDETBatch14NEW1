package Project;

public interface Shape {
    void calculateArea();
    void calculatePerimiter();
}
    class circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println(3.14*(20*2));
    }
    @Override
    public void calculatePerimiter() {
        System.out.println(2 * 3.14 * 20);
    }
    static class square implements Shape {
        @Override
        public void calculateArea() {
            System.out.println(8*8);
        }
        @Override
        public void calculatePerimiter() {
            System.out.println(8+8+8+8);
        }
    }
    }
