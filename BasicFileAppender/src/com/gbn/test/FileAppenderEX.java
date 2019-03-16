package com.gbn.test;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class FileAppenderEX {
	
	public static Logger log = Logger.getLogger(FileAppenderEX.class);
	
	public static void main(String[] args) {
		Layout l1 = new SimpleLayout();
		 Appender a;
		  try
		  {
		  a = new FileAppender(l1,"my.txt", false); // 3rd parameter is true by default 
		  //true = Appends the data into my.txt
		  // false = delete previous data and re-write
		  log.addAppender(a);
		  }
		  catch(Exception e) {}	  
	 
		  log.fatal("OOps.. Some Serious Error Occured");
		  
		  System.out.println("done writing in to logger file");
	  }
		
	}
