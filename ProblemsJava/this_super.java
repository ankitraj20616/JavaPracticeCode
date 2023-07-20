package ProblemsJava;
import java.util.Scanner;
public class this_super {
    public static void main(String[] args) {
        doclass d = new doclass(4);
    }
}
class ekclass{
    private int a;
    ekclass(int a){
        this.a = a;
        System.out.println("I am a superconstructor = "+a);
    }
    int setA(){
        return a;
    }
}
class doclass extends ekclass{
    private int b;
    doclass(int b){
        super(b);
        this.b = b;
        System.out.println("I am subconstructor = "+b);
    }
}
