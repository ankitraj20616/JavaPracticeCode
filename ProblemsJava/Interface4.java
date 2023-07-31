package ProblemsJava;

public class Interface4 {
    public static void main(String[] args) {
        Remote rc = new Remote();
        rc.openNetflix();
    }
}
interface TVRemote{
    void changeChannel();
    void VolumeUp();
    void VolumeDown();
    void TakeMeToChannel(int n);
}
interface SmartTVRemote extends TVRemote{
    void openNetflix();
    void openPrime();
    void openYoutube();
}
class Remote implements SmartTVRemote{
    public void changeChannel(){
        System.out.println("Changing channel....");
    }
    public void VolumeUp(){
        System.out.println("Raising Volume....");
    }
    public void VolumeDown(){
        System.out.println("Decresing Volume....");
    }
    public void TakeMeToChannel(int n){
        System.out.println("Taking you to the channel = "+n);
    }
    public void openNetflix(){
        System.out.println("Opening netfix.....");
    }
    public void openPrime(){
        System.out.println("Opening Netfix...");
    }
    public void openYoutube(){
        System.out.println("Opening YouTube....");
    }
}
