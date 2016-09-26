package com.bcm.gfatca;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 * 1. Add dispatcher of command line.
 * 2. add xml.java, schema.java, (interface)ActInterface/ActConvert/parser/validator/... and put logs on it 
 * 3. upgrade the logging to spring aop
 * ------
 *  1. GInterface : An interface with setSchema and perform method; Class like GParser, GConvertor and etc implemente it.
 *  2. GParser:
 *  3. GConvertor:
 *  4. GValidator:
 *  5. GSigner:
 *  6. GPackager:
 */
public class Launcher {

    final static Logger logger = Logger.getLogger(Launcher.class); 

    public static void main( String[] args ){
	for (i=0; i<args.length;i++){
            if(args[i] == "-pr"){
	        GParser parser= (GParser)context.getBean("parser");
		parser.setSchema(args[i+1]);
		parser.perform();
		i=i+1;
	    }
	    /*
            if(args[i] == "-c"){
	        GConvertor convertor= (GConverter)context.getBean("convertor");
		convertor.setSchema(new GSchema(args[i+1]));
		convertor.setInput(new GExcel(args[i+2]));
		convertor.perform();
		i=i+2;
	    }
            if(args[i] == "-v"){
	        GValidator validator= (GValidator)context.getBean("validator");
		validator.setSchema(new GSchema(args[i+1]));
		validator.setInput(new GXML(args[i+2]));
		validator.perform();
		i=i+2;
	    }
            if(args[i] == "-s"){
	        GSigner signer= (GSigner)context.getBean("signer");
		signer.setSchema(new GSchema(args[i+1]));
		signer.setInput(new GXML(args[i+2]));
		signer.perform();
		i=i+2;
	    }
            if(args[i] == "-pc"){
	        GPackager packager= (GPackager)context.getBean("packager");
		packager.setSchema(new GSchema(args[i+1]));
		packager.setInput(new GXML(args[i+2]));
		packager.perform();
		i=i+2;
	    }
	    */
	}
    }
}
