package InnerClass;


class A{
    public void show(){
        System.out.println("in A show");
    }
}
public class Demo {
    public static void main(String a[]){
        A obj = new A(){
            public void show(){
                System.out.println("in New show");
            }
        };
        obj.show();
    }
}
