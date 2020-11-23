package templateMethod;

public abstract class AbstractSpeaker {
	public abstract void turnOn();
	
	public abstract void musicOn();
	
	public final void playMusic() {
		turnOn();
		musicOn();
		turnOff();
	}
		
	
	public abstract void turnOff();
}
