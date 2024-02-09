package Interface;

//abstract class Computer{
interface Computer{
    //public abstract void code();
    void code();
}
//class Laptop extends Computer{
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile,run");
    }
}
//class Desktop extends Computer{
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile,run : faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class Demo {
    public static void main(String arg[]){
        // below are interfaces refrences//
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer narendra = new Developer();
        narendra.devApp(desk);
    }
}
// here it is loosely coupled as Developer is depend upon computer not on laptop or desktop
