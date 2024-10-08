package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	WebDriver driver;
	public void selectIndex(WebElement elementindex)
	{
		Select select=new Select(elementindex);
		select.selectByIndex(0);
	}
	public void selectfromDropDown(WebElement element)
	{
		Select select=new Select(element);
		select.selectByIndex(1);
	}
	public void selectCategoryFromDropDown(WebElement category)
	{
		Select select=new Select(category);
		select.selectByIndex(1);
	}
	public void selectsubCategory(WebElement subCategory)
	{
		Select select=new Select(subCategory);
		select.selectByIndex(2);
	}
	public void selectUserType(WebElement usertype)
	{
		Select select=new Select(usertype);
		select.selectByIndex(2);
	}
	public void selectMinimumPiece(WebElement element3)
	{
		Select select=new Select(element3);
		select.selectByIndex(5);
	}
	public void scrollDownX250Y250()
	{
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(250,250)");
	}
	public void scrollDownX280Y280()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(280,280)");
	}
	public void scrollDownX300Y300()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(300,300)");
	}
	public void scrollDownX320Y320()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(320,320)");
	}
	public void scrollDownX380Y380()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(380,380)");
	}
	public void scrollDownX430Y430()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(450,450)");
	}
	public void scrollDownX500Y500()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(500,500)");
	}
	public void scrollDownX700Y700()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(700,700)");
	}
	public void scrollDownX893Y61()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(893,61)");
	}
	public void scrollDownX900Y900()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(900,900)");
	}
	public void scrollDownX1300Y1300() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(1300,1300)");
	}
	public void scrollBackToTop()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");		
	}	
}
