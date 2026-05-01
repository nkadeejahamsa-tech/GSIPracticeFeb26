package weeklyAssignment;
interface Camera {
    void takePhoto();
}
interface MusicPlayer {
    void playMusic();
}
interface SmartFeatures {
    void connectToWifi();
}
class SmartPhone implements Camera,MusicPlayer,SmartFeatures{

	@Override
	public void connectToWifi() {
		// TODO Auto-generated method stub
		System.out.println("Connected to WiFi");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing music...");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("Photo captured successfully");
	}
	
}
public class Week7_Apr24_Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		SmartPhone sp = new SmartPhone();
		sp.connectToWifi();
		sp.playMusic();
		sp.takePhoto();

	}

}
