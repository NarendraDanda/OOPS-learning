package Enum;

enum Laptop{
    Macbook(2000), XPS(2200), Surface, Thinkpad(1000);
// above all are objects of Laptop
    private  int price;

    Laptop(){
        price = 2000;
        // default constructor have no values, thus avoiding error in 'Surface' object
    }
    Laptop(int price) {
        this.price = price;
        System.out.println(" in Laptop" + this.name()); // prints objects with values only
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class NewDemo {
    public static void main(String arg[]){
//        Laptop lap = Laptop.Macbook;
//        System.out.println(lap + " : " + lap.getPrice());
//
        for (Laptop lap: Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
