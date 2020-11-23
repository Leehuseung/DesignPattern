package templateMethod;

public class PcSpeaker extends AbstractSpeaker{

	@Override
	public void turnOn() {
		System.out.println("PC 스피커 전원 on");
	}

	@Override
	public void musicOn() {
		System.out.println("PC 스피커 음악듣기");
	}

	@Override
	public void turnOff() {
		System.out.println("PC 스피커 전원 off");
	}

}
