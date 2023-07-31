package ProblemsJava;

public class threadMehtod {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
class mythread extends Thread{
    public void run(){
        int i = 1;
        while(i<=400){
            System.out.println("I am Thread"+getId());
            i++;
        }
    }
}
