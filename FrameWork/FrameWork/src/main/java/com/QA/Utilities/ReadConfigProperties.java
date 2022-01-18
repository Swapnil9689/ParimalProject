package com.QA.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigProperties {
	Properties pro;
	public ReadConfigProperties()
	{
		File src =new File("C:\\Users\\parim\\eclipse-workspace\\FrameWork\\src\\main\\java\\com\\QA\\Utilities\\config.properties");
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getApplicationURL()
	{
		String baseURL = pro.getProperty("URL");
		return baseURL;
	}
	
	public String getEmail()
	{
		String email = pro.getProperty("UserName");
		return email;
	}
	public String getPass()
	{
		String pass = pro.getProperty("Password");
		return pass;
	}

}


