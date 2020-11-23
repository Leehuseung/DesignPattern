package templateMethod;

public class Main {
	public static void main(String[] args) {
		AbstractSpeaker bluetooth = new BluetoothSpeaker();
		
		AbstractSpeaker pc = new PcSpeaker();
		
		bluetooth.playMusic();
		
		pc.playMusic();
				
		
	}
}
