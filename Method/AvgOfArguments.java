package Method;
import java.util.Scanner;
public class AvgOfArguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find average = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = average(a,b,c);
        System.out.println("Average of your entered three number is = "+avg);
    }
    static double average(int ...a){
        int sum = 0;
       for (int x : a)
           sum +=x;
       double avg = sum/3.0;
       return avg;
    }
}
