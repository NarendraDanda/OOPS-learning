package Polymorphism;

// Dynamic polymorphism//
class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}
public class Demo {
     public static void main(String arg[]){
         A obj = new A(); // obj is of type A but of object of B
         obj.show();

         obj = new B();
         obj.show();

         obj = new C();
         obj.show();
     }
}
