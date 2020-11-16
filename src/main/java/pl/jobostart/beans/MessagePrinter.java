package pl.jobostart.beans;

public class MessagePrinter {
	
	private SimpleMessageProducer producer;

	public MessagePrinter(SimpleMessageProducer producer) {
		this.producer = producer;
	}
	
	
	public MessagePrinter() {
		}
	
	
	public SimpleMessageProducer getProducer() {
		return producer;
	}
		

	public void setProducer(SimpleMessageProducer producer) {
		this.producer = producer;
	};
	
	
	public void print() {
		System.out.println(producer.getMessage());
	}
		
		

}
