package com.QA.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.QA.TestBase.DemoWeb_TestBase;

public class DemoWeb_Utilities extends DemoWeb_TestBase {
	
	public void TakeScreenShot(String SS) throws IOException {
		try {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\parim\\Desktop\\Software Testing Course\\ScreenShots\\DemoWebPage\\"+SS+".png");
		FileHandler.copy(src, des);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
