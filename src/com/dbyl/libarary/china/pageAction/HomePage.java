package com.dbyl.libarary.china.pageAction;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;


public class HomePage extends BasePage {
	private Locator profile=new Locator("//div[@class='login']");
	public HomePage(WebDriver driver) throws IOException {
		super(driver);
	}

	public void clickOnMyProfile() throws Exception
	{
		click(profile);
	}
	
	public void clickAndHoldProfile() throws IOException
	{
		clickAndHold(profile);
	}
}
