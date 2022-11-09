package com.demoactitimeAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertUtilActiTime {
	
		public  String getpropertydata(String filepath,String key) {
			FileInputStream file;
		
				try {

					file = new FileInputStream(filepath);
					Properties property=new Properties();
					property.load(file);
					return property.getProperty(key);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				return null;
				
		
			
		
			
		}

}
