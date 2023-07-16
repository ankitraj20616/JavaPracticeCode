package ProblemsJava;
import java.util.Scanner;
import java.lang.Math;
public class GuessTheNoGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0 ,c = 0;
       for(int i =1 ; i<=5 ; i++) {
           System.out.println("Enter your number between 0 to 100 = ");
           int n = sc.nextInt();
           logic gm = new logic(n);
           System.out.println("Computer random no = " + gm.getComp());
           if (gm.getRand() > gm.getComp()) {
               p++;
               System.out.println("Player win! " + p);
           } else {
               c++;
               System.out.println("Computer win! " + c);
           }
           System.out.println("=======================================");
       }
       if(p>c)
           System.out.println("Overall Player won! with points : "+p);
       else if(p==c)
           System.out.println("Match tie! ");
       else
           System.out.println("Overall Computer won! with points : "+c);
    }
}
class logic{
    private int rand ;
    public logic(int n){
        rand = n;
    }
    private int comp = (int) (Math.random()*100);
    public double getComp() {
        return comp;
    }

    public int getRand() {
        return rand;
    }
}
