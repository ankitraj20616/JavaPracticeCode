package ProblemsJava;
import java.util.Scanner;
public class Interface2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         SmartPhone sm = new SmartPhone();
        System.out.println("Opening calculator.... ");
        System.out.println("Enter two number....");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Addition is = "+sm.add(x,y));
        sm.clicking();
        sm.saving();
    }
}
class Phone{
    void phonecall(){
        System.out.println("Call your inputed number...");
    }
    void plugin(){
        System.out.println("Charging battery....");
    }
    void plugout(){
        System.out.println("Discharging batter.....");
    }
}
interface Calculator{
    int add(int x,int y);
    int sub(int x,int y);
    int multi(int x,int y);
    int div(int x,int y);
}
interface Camera{
    void clicking();
    void saving();
}
interface gps{
    void locating();
}
interface mediaplayer{
    void play();
    void pause();
}
class SmartPhone extends Phone implements Calculator , Camera , gps ,mediaplayer{
    public int add(int x,int y){
        return (x+y);
    }
    public int sub(int x,int y){
        return (x-y);
    }
    public  int multi(int x,int y){
        return (x*y);
    }
    public int div(int x,int y){
        return (x/y);
    }
    public void clicking(){
        System.out.println("Clicking your photo....");
    }
    public void saving(){
        System.out.println("Saving your clicked photo....");
    }
    public void locating(){
        System.out.println("Locating your location....");
    }
    public void play(){
        System.out.println("Playing music....");
    }
    public void pause(){
        System.out.println("Pausing music....");
    }
}
