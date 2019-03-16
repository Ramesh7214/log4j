package com.gbn.test;

import org.apache.log4j.Logger;

public class Test {
	static Logger log = Logger.getLogger(Test.class);

public static void main(String[] args) {      

	log.debug("This is debug message");
	log.info("This is info message");
	log.warn("This is warn message");
	log.fatal("This is fatal message");
	log.error("This is error message");

    System.out.println("Done logging. Check log.txt");

}}
