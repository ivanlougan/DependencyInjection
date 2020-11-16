package pl.jobostart.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.jobostart.beans.MessagePrinter;

public class SpringDiApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		printer.print();
		ctx.close();
	}
}
