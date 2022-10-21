package Repls;

public class Replit166 {
}
class Main31 {
    public static void main(String [] args){
        // Animal[] arr={new Cat("Cat"),new Kitten1("kitten1"),new Kitten2("kitten2"),new Kitten3("kitten3")};
        Cat cat=new Cat("Cat");
        Kitten1 obj1=new Kitten1("kitten1");
        Kitten2 obj2=new Kitten2("kitten2");
        Kitten3 obj3=new Kitten3("kitten3");
        Animal[] arr={cat,obj1,obj2,obj3};
        for(Animal ans:arr){
            ans.eat();
            ans.sleep();
        }
    }
}
class Animal{
    String type;
    Animal(String type){
        this.type=type;
    }
    void eat(){
        System.out.println(type+" eats");
    }
    void sleep(){
        System.out.println(type+" sleeps");
    }
}
class Cat extends Animal{
    Cat(String type){
        super(type);
    }
    void sleep(){
        System.out.println(type+" sleeps a lot");
    }
}
class Kitten1 extends Cat{
    Kitten1(String type){
        super(type);
    }
    void eat(){
        System.out.println(type+" eats milk");
    }
}
class Kitten2 extends Cat{
    Kitten2(String type){
        super(type);
    }
    void eat(){
        System.out.println(type+" eats snacks");
    }
}
class Kitten3 extends Cat{
    Kitten3(String type){
        super(type);
    }
    void eat(){
        System.out.println(type+" eats everything");
    }
}

