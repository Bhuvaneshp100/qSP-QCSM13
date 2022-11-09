package com.actitime.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyutil {
	public String getpropertydata(String filepath,String key) {
		FileInputStream file;
		try {
			file = new FileInputStream(filepath);
			Properties property=new Properties();
			property.load(file);
			return property.getProperty(key);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
