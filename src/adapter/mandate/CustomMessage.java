package adapter.mandate;

public class CustomMessage extends Custom{
	
	DefaultMessage defaultMessage = new DefaultMessage();

	public String getCustomSubject() {
		return defaultMessage.getSubject();
	}
	public String getCustomContent() {
		return defaultMessage.getContent();
	}
	

}
