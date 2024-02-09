package InterfaceTypes;

interface B{
    int add(int i, int j);
}
public class Demo1 {
    public static void main(String arg[]){
//        B obj = new B(){
//            public int add(int i , int j){
//                return i+j;
//            }
//        };
        B obj = (i,j)-> i+j; // when the statement supposed to return is one statement
                                    //we don't need to return it.
        int result = obj.add(5,6);
        System.out.println(result);
    }
}
