package AbstractAnonymousInnerClass;

abstract class A{
    public abstract void show();
}
public class Demo {
    public static void main(String arg[]){
        A obj = new A() {
            @Override // anonymous class for Abstract class
            public void show() {
                System.out.println("in new Show");
            }
        };
        obj.show();
    }
}
