package com.QA.TestExecution;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.QA.PageLayer.DemoWeb_HomePage;
import com.QA.TestBase.DemoWeb_TestBase;
import com.QA.Utilities.DemoWeb_Utilities;

public class DemoWeb_TestExecution extends DemoWeb_TestBase {
	DemoWeb_HomePage h;
	DemoWeb_Utilities u = new DemoWeb_Utilities();;
	
	@Test(priority = 1)
	public void CheckSignInButton() throws IOException {
	    h = new DemoWeb_HomePage();
		h.ClickOnSignInButton();
		u.TakeScreenShot("1");
	}
	
	@Test(priority = 2)
	public void CheckSearchBox() throws IOException {
		h = new DemoWeb_HomePage();
		h.CheckSearchBox("uvwxyz");
		u.TakeScreenShot("2");
	}
	
	@Test(priority = 3)
	public void CheckMajorTabs() throws IOException {
		h = new DemoWeb_HomePage();
		h.CheckMajorTabs();
		u.TakeScreenShot("3");
	}
	
	@Test(priority = 4)
	public void CheckAddToCartButton() throws IOException {
		h = new DemoWeb_HomePage();
		h.CheckAddToCartButton();
		u.TakeScreenShot("4");
	}
	
	@Test(priority = 5)
	public void CheckSuvBlocks() throws IOException {
		h = new DemoWeb_HomePage();
		h.CheckSubBlocks();
		u.TakeScreenShot("5");
	}

}
