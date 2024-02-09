package Inheritence;/*inheritence */



public class Demo {
     public static void main(String a[]){
         AdvCalc obj = new AdvCalc();
         int r1 = obj.add(3,4);
         int r2 = obj.subtract(8,4);
         int r3 = obj.div(100,4);
         int r4 = obj.multi(6,9);

         System.out.println(r1 + " " + r2 + " " + r3 +" "+ r4);
     }
}
