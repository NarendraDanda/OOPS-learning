package DowncastingUpcasting;


class A{
    public void show1(){
        System.out.println("in A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B Show");
    }
}
public class Demo {
    public static void main(String arg[]){
        A obj = (A) new B(); // upcasting A obj = new B()
        obj.show1();

        B obj1 = (B) obj ; // obj is reference of A but object of B
        obj1.show2();


    }
}
