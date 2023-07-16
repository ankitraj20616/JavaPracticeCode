package ProblemsJava;
import  java.util.Scanner;
class Maths{
    int sum(int a, int b){
        int s = a + b;
        return s;
    }
}

public class CreatingObject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number =");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Maths obj = new Maths();
        int  result = obj.sum(a,b);
        System.out.println("The sum is = "+result);

    }
}
