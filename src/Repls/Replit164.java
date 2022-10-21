package Repls;

class main {
    public static void main(String[]args){
        Child1 obj1=new Child1();
        Child2 obj2=new Child2();
        Child3 obj3=new Child3();
        //Parent[] objects={new Chld1(),new Child2(),new Child3()};
        Parent1[] objects={obj1,obj2,obj3};
        for(Parent1 ans:objects){
            ans.hello();
        }
    }
}
class Parent1{
    void hello(){
        System.out.println("method in Parent class");
    }
}
class Child1 extends Parent1{
    void hello(){
        System.out.println("method in Child1 class");
    }
}
class Child2 extends Parent1{
    void hello(){
        System.out.println("method in Child2 class");
    }
}
class Child3 extends Parent1{
    void hello(){
        System.out.println("method in Child3 class");
    }
}
