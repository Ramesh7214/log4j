package com.gbn.test;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class ConsoleEx {

	public static Logger log = Logger.getLogger(ConsoleEx.class);

	public static void main(String[] args) {

		Layout l1 = new SimpleLayout();
		Appender a = new ConsoleAppender(l1);
		log.addAppender(a);
		log.debug("OOps.. Some Serious Error Occured");
		//System.out.println("done writing in to Console");
	}

}
