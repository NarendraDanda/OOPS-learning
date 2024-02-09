package ObjectClass;

import java.util.Objects;

class Laptop{
     String model;
     int price;
//     public String toString(){
//         return model + " : " + price;
//     }
//     public boolean equals(Laptop that){
//         if(this.model.equals(that.model) && this.price == that.price){
//             return true;
//         }

    @Override
    public String  toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
//         else
//             return false;
//     }
}
public class Demo {
    public static void main(String arg[]){
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo yoga";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);
        System.out.println(result);
       // System.out.println(obj.toString()); // by default it callls toString() method, even we not mentioned
    }
}
