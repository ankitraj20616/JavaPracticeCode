package ProblemsJava;

public class Interface3 {
    public static void main(String[] args) {
        Mymonkey m = new Mymonkey();
        m.jump();
        m.eat();
        m.bite();
        m.sleep();
    }
}
interface Monkey{
    void jump();
    void bite();
}
interface BasicHabbit{
    void eat();
    void sleep();
}
class Mymonkey implements BasicHabbit,Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biteing....");
    }
    public void eat(){
        System.out.println("Eating....");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
}