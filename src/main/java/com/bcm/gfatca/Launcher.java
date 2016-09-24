package com.bcm.gfatca;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 * 3. test above dependency
 * 2. add xml.java, schema.java, (interface)ActInterface/ActConvert/parser/validator/... and put logs on it (upgrade the logging to spring aop later)
 */
public class Launcher {

    final static Logger logger = Logger.getLogger(Launcher.class); 

    public static void main( String[] args ){
	logger.info("Launcher start.");
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	HelloWorld demo= (HelloWorld) context.getBean("helloBean");
	demo.printHello();
	logger.info("Launcher end.");
    }
}
