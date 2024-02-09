package ExceptionHandling;

class NarendraException extends Exception{
    public NarendraException(String string){
        super(string);
    }
}
public class Demo1 {
    public static void main(String arg[]){
        int i = 3;
        int j = 0;
        try
        {
            j = 18/i;
//to throw the exception by using conditon//
            if(j==6)
                throw new NarendraException("to avoid zero output");
        }
        catch(NarendraException e){
            j = 18/2;
            System.out.println("thats the default output: " + e);
        }
        catch (Exception e){
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
        System.out.println("Its Done");
    }
}
