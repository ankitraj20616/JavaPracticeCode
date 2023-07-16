package ProblemsJava;

public class VariableArguments {
    public static void main(String[] args) {
        System.out.println("The sum of 2,3,5 is = "+sum(2,3,5));
        System.out.println("The sum of 6,7,2,1 is = "+sum(6,7,2,1 ));
        System.out.println("The sum of 10,11,40,44,80,20 is = "+sum(10,11,40,44,80,20 ));
    }
    static int sum(int ...arr){
        int result = 0;
        for (int a : arr)
        {
            result += a;
        }
        return result;
    }
}
