package testscripts;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import constants.Constants;
import pages.Login;
import pages.ManageProductNewProductCreate;
import utilities.PageUtility;

public class ManageProductNewProductTest extends Base
{
  @Test
  public void manageProduct()
  {
	  PageUtility page=new PageUtility();
	  Login login=new Login(driver);
	  login.enterValidUsername("admin");
	  login.enterValidPassword("admin");
	  login.clickLoginbutton();
	  ManageProductNewProductCreate mangNew=new ManageProductNewProductCreate(driver);
	  mangNew.clickManageProduct();
	  mangNew.clickNew();
	  String title="Milk";
	  mangNew.enterTitleValue(title);
	  mangNew.selectProductType();
	  mangNew.selectCategoryFromDropDown();
	  mangNew.selectSubCategoryFromDropDown();
	  mangNew.selectPriceType();
	  mangNew.selectMinimumPrice();
	  String qty="100";
	  mangNew.enterMaximumQuantity(qty);
	  String price="45";
	  mangNew.enterPriceforProduct(price);
	  String stock="150";
	  mangNew.stockAvailablityforProduct(stock);
	  //page.scrollDownX380Y380();
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(400,400)");
	  mangNew.clickSaveButtonforCreatingNewProduct();
	  boolean isAlertDisplayed= mangNew.isalertdisplayed();
	  assertTrue(isAlertDisplayed,Constants.ERRORFORMANAGEPRODUCTNEWPRODUCT);
	  }
}
