package Inheritence1;

interface A{
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("in B show");
    }
    public void config(){
        System.out.println("in B config");
    }
    public void run(){
        System.out.println("B running");
    }
}
public class Demo {
    public static void main(String arg[]){
        A obj;
        obj = new B();
        obj.config();
        obj.show();

        X obj1 = new B();
    }
}
