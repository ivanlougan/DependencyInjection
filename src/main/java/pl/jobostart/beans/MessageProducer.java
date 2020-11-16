package pl.jobostart.beans;

public class MessageProducer implements SimpleMessageProducer{

	@Override
	public String getMessage() {
		return "example message " + System.currentTimeMillis();
	}
	
	

}
