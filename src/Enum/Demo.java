package Enum;

enum Status{
    Running, Failed, Pending, Success;
}
public class Demo {
    public static void main(String arg[]){
        int i = 5;

        Status s = Status.Pending;

        System.out.println(s.getClass().getSuperclass());
//        System.out.println(s);

//        Status[] ss = Status.values();
//
//        for(Status s : ss){
//            System.out.println(s+ " : " + s.ordinal());
//        }
        switch (s){
            case Running :
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
