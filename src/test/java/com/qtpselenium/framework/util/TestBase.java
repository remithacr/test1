package com.qtpselenium.framework.util;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.SkipException;

public class TestBase {
	
	public static Properties prop;
	public static Logger APPLICATION_LOG = Logger.getLogger("devpinoylogger");
	
	public  static void init(){
		if(prop ==  null){
			prop = new Properties();
			try {
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resource\\Project.properties");
				prop.load(fs);
				System.out.println("property file reading : " + prop.getProperty("test"));
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void validatRunModes(String suiteName,String testName,String dataRunMode){
		
		init();
		boolean suiteRunmode = Utility.isSuiteRunnable(suiteName, new Xls_Reader(System.getProperty("user.dir") + "\\Suite.xlsx"));
		System.out.println("suite run mode : " +suiteRunmode);
		boolean testRunmode = Utility.isTestRunnable(testName, new Xls_Reader(System.getProperty("user.dir") + "\\SuiteA.xlsx"));
		System.out.println("Test run mode : " +testRunmode);
		boolean dataMode=false;
		if(dataRunMode.equals(Constants.RUNMODE_YES))
			dataMode=true;
		
		if(!(suiteRunmode && testRunmode && dataMode))
		throw new SkipException("skipped");
		
		
		
		
	}

}
