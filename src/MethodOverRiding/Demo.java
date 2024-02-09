package MethodOverRiding;


class A {
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");//method overriding//
    }
}
public class Demo {
    public static void main(String arg[]){
    B obj = new B();
    obj.show();
    obj.config();

    A obj1 = new A();
    obj1.show();
    }
}
