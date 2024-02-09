package ExceptionHandling;

public class Demo {
    public static void main(String arg[]){
        int i = 3;
        int j = 0;
        try
        {
            j = 18/i;
//to throw the exception by using conditon//
            if(j==6)
                throw new ArithmeticException("to avoid zero output");
        }
        catch(ArithmeticException e){
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
