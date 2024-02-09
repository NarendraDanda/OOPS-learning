package InterfaceTypes;

@FunctionalInterface //SAM - single abstract method
interface A{
    void show( int i);
}
public class Demo {
    public static void main(String arg[]){
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println(" in A Show");
//            }
//        };
//        obj.show();

//        A obj = () -> System.out.println(" Show using Lambda Expression");
//        obj.show();

        A obj1 = ( int i ) -> System.out.println(" show using Lambda expression with parameters " + i);
        obj1.show(5);
    }
}
