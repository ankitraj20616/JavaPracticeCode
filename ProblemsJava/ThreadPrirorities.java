package ProblemsJava;

public class ThreadPrirorities {
    public static void main(String[] args) {
        myth t1 = new  myth("Ankit_1");
        myth t2 = new  myth("Ankit_2");
        myth t3 = new  myth("Ankit_3");
        myth t4 = new  myth("Ankit_4");
        t1.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class myth extends Thread{
    myth(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("I am a Thread "+getName());
        }
    }
}
