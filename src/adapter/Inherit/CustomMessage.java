package adapter.Inherit;

public class CustomMessage extends DefaultMessage implements Custom{

	public String getCustomSubject() {
		return getSubject();
	}
	public String getCustomContent() {
		return getContent();
	}
	

}
