package yxm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import yxm.pojo.Printer;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext  context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		Printer p = (Printer)context.getBean("UsePrinter");
		
		System.out.println(p.Printerinfo());
	}

}
