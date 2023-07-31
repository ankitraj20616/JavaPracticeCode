package ProblemsJava;

public class AbstractClass1 {
    public static void main(String[] args) {
        MyPen p = new MyPen();
        p.refill();
        p.write();
        p.changePen();
    }
}
abstract class pen{
    abstract void write();
    abstract void refill();
}
class MyPen extends pen{
    void write(){
        System.out.println("Write any sentence...");
    }
    void refill(){
        System.out.println("Refill your pen....");
    }
    void changePen(){
        System.out.println("Ink is over...Change your pen....");
    }
}
