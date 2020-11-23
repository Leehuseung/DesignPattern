package templateMethod;

public class BluetoothSpeaker extends AbstractSpeaker{

	@Override
	public void turnOn() {
		System.out.println("블루투스 스피커 전원 on");
	}

	@Override
	public void musicOn() {
		System.out.println("블루투스 스피커 음악 듣기");
	}

	@Override
	public void turnOff() {
		System.out.println("블루투스 스피커 전원 off");
		
	}

}
