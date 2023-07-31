package ProblemsJava;

public class Polymorphism1 {
    public static void main(String[] args) {
         camera Nokia = new smartPhone();
         Nokia.click();
         Nokia.save();
         Nokia.retake();
    }
}
abstract class TelePhone{
    abstract void ring();
    abstract void call();
    abstract void lift();
    abstract void disconnect();
}
interface GPS{
    void findLocation();
}
interface camera{
    void click();
    void save();
    void retake();
}
interface MediaPlayer{
    void play();
    void pause();
}
class smartPhone extends TelePhone implements camera,GPS,MediaPlayer{
    void ring(){
        System.out.println("Ringing....");
    }
    void call(){
        System.out.println("Calling...");
    }
    void lift(){
        System.out.println("Lifting....");
    }
    void disconnect(){
        System.out.println("Disconnectng....");
    }
    public void findLocation(){
        System.out.println("Finding location....");
    }
    public void click(){
        System.out.println("Taking snap....");
    }
    public void save(){
        System.out.println("Saving....");
    }
    public void retake(){
        System.out.println("Retaking....");
    }
    public void play(){
        System.out.println("Playing....");
    }
    public void pause(){
        System.out.println("Pausing....");
    }
}













