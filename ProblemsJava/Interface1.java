package ProblemsJava;
import java.util.Scanner;
public class Interface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed of cycle =");
        AvonCycle cy = new AvonCycle(sc.nextInt());
        System.out.print("Enter your incremented speed = ");
        int i = sc.nextInt();
        System.out.println("Speed after incrementing = "+cy.speedup(i));
        System.out.print("Enter your dercrement speed = ");
        int j = sc.nextInt();
        System.out.println("Speed after decrementing = "+cy.slowdown(j));
        System.out.print("Turn right = ");
        cy.turnRight();
        System.out.print("Turn left = ");
        cy.turnLeft();
    }
}
interface Bicycle{
    int speedup(int increment);
    int slowdown(int decrement);
    void turnRight();
    void turnLeft();
}
class AvonCycle implements Bicycle{
    private int speed;
    AvonCycle(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int speedup(int increment){
        return (speed+increment);
    }
    @Override
    public int slowdown(int decrement){
        return (speed- decrement);
    }
    @Override
    public void turnRight(){
        System.out.println("Rotate your cycle handle right direction");
    }
    @Override
    public void turnLeft(){
        System.out.println("Rotate your cycle handle left direction");
    }
}