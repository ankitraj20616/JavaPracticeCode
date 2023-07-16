package ProblemsJava;

public class StarPattern {
    public static void main(String[] args) {
        System.out.println("Your star patter is = ");
        pattern();
    }
    static void pattern()
    {
        for(int i=1;i<=4;i++)
        {
            for (int j =1;j<=4;j++)
            {
                if(j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
