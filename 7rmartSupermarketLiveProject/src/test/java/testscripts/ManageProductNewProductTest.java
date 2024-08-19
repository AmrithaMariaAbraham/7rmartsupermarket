package testscripts;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.Login;
import pages.ManageProductNewProductCreate;

public class ManageProductNewProductTest extends Base
{
  @Test
  public void manageProduct() throws Exception
  {
	  Login login=new Login(driver);
	  String useramefield="admin";
	  String passwordfield="admin"; 	  
	  login.enterValidUsername(useramefield);
	  login.enterValidPassword(passwordfield);
	  login.clickLoginbutton();
	  ManageProductNewProductCreate mangProd=new ManageProductNewProductCreate(driver);
	  mangProd.manageProductClick();
	  mangProd.clickNew();
	  mangProd.isNewWindowDisplayed();
	  String title="Tomato";
	  mangProd.enterTitleValue(title);
	  mangProd.selectProductType();
	  String tag="001";
	  mangProd.enterValueforTagField(tag);	  
	  mangProd.selectCategoryFromDropDown();
	  mangProd.selectSubCategoryFromDropDown();
	  mangProd.selectGroupIDfromDropDown();
	  mangProd.selectPriceType();
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(250,250)");
	  mangProd.selectMinimumPrice();
	  String qty="25";
	  mangProd.enterMaximumQuantity(qty);
	  String price="60";
	  mangProd.enterPriceforProduct(price);
	  String mRp="75";
	  mangProd.enterMRPforProduct(mRp);
	  String stockAvailable="45";
	  mangProd.stockAvailablityforProduct(stockAvailable);
	  String purchasePrice="40";
	  mangProd.enterPurchasePriceforProduct(purchasePrice);
	  js.executeScript("window.scrollBy(380,380)");
	  mangProd.clickSaveButtonforCreatingNewProduct();
	  js.executeScript("window.scrollBy(0,250)");
	  mangProd.isAlertDisplayed();
	  mangProd.goToHomePage();
	  mangProd.isHomePageDisplayed();
  }
}
