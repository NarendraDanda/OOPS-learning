package AbstractKeyword;


abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("play Music");
    }
}

class WagonR extends Car{ // concrete class
    public void drive(){
        System.out.println("drive WagonR");
    }
}
public class Demo {
    public static void main(String a[]){
         Car obj = new WagonR();
         obj.drive();
         obj.playMusic();
    }
}
