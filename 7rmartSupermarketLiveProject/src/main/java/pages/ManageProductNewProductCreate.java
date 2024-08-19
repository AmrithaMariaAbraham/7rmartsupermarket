package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageProductNewProductCreate 
{
	WebDriver driver;
	public ManageProductNewProductCreate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[12]") WebElement manageProduct;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement New;
	//@FindBy(xpath="//h3[text()='Enter Product Informations']") WebElement NewProductInfo;
	@FindBy(xpath="//input[@id='title']") WebElement enterTitle;
	@FindBy(xpath="//input[@value='Others']") WebElement productType;
	@FindBy(xpath="//input[@id='tag']") WebElement Tag;
	@FindBy(xpath="//select[@id='cat_id']") WebElement category;
	@FindBy(xpath="//select[@id='sub_id']") WebElement subCategory;	
	@FindBy(xpath="//select[@id='grp_id']") WebElement groupID;
	@FindBy(xpath="//input[@id='purpose1']") WebElement priceType;
	@FindBy(xpath="//select[@id='p_minimum']") WebElement minimumPiece;
	@FindBy(xpath="//input[@id='p_max']") WebElement maximumQuantity;
	@FindBy(xpath="//input[@id='p_price']")WebElement price;
	@FindBy(xpath="//input[@id='p_mrp']") WebElement mrp;
	@FindBy(xpath="//input[@id='p_stock']") WebElement stock;
	@FindBy(xpath="//input[@id='p_pp']") WebElement purchasePrice;
	@FindBy(xpath="//div[@class='note-editable card-block']") WebElement description;
	@FindBy(xpath="//*[@id='main_img']") WebElement mainImage;
	@FindBy(xpath="//button[@name='create']") WebElement submitButton;	
	
	public void clickManageProduct()
	{
		manageProduct.click();
	}
	public void clickNew()
	{
		New.click();
	}
	public void enterTitleValue(String title)
	{
		enterTitle.sendKeys(title);
	}
	public void selectProductType()
	{
		productType.click();
	}
	public void enterValueforTagField(String TagField)
	{
		Tag.sendKeys(TagField);
	}
	public void selectCategoryFromDropDown()
	{
		Select dropdown=new Select(category);
		dropdown.selectByIndex(0);
	}
	public void selectSubCategoryFromDropDown()
	{
		Select dropdown=new Select(subCategory);
		dropdown.selectByIndex(0);
	}
	public void selectGroupIDfromDropDown()
	{
		Select dropdown=new Select(groupID);
		dropdown.selectByIndex(1);
	}
	public void selectPriceType()
	{
		priceType.click();
	}
	public void selectMinimumPrice()
	{
		Select dropdown=new Select(minimumPiece);
		dropdown.selectByIndex(5);		
	}
	public void enterMaximumQuantity(String maxQty)
	{
		maximumQuantity.sendKeys(maxQty);
	}
	public void enterPriceforProduct(String Price)
	{
		price.sendKeys(Price);
	}
	public void enterMRPforProduct(String MRP)
	{
		mrp.sendKeys(MRP);
	}
	public void stockAvailablityforProduct(String stockAvail)
	{
		stock.sendKeys(stockAvail);
	}
	public void enterPurchasePriceforProduct(String pp)
	{
		purchasePrice.sendKeys(pp);
	}
	public void enterDescription(String des)
	{
		description.sendKeys(des);
	}
	public void uploadMainImgforProduct() 
	{
		mainImage.click();
		mainImage.sendKeys("C:\\Users\\amrit\\Downloads\\tomaato.jpg");
	}
	public void clickSaveButtonforCreatingNewProduct()
	{
		submitButton.click();
	}	
	
}
