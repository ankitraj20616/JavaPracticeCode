package ProblemsJava;
import java.util.Scanner;
public class Inheritance2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter value of x and y =");
        int x = st.nextInt();
        int y = st.nextInt();
        son sc = new son(x,y);
    }
}
class father{
    father(){
        System.out.println("Father constructor");
    }
    father(int x)
    {
        System.out.println("Overloaded Father constructor// : "+x);
    }
    father(int x,int y)
    {
        System.out.println("Overloaded Father constructor : "+x);
    }
}
class son extends father{
    son(int x,int y){
        super(x);
        System.out.println("Son constructor");
    }
}
