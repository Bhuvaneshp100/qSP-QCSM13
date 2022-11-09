package paywheelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import paywheel.ExcelData;

public class BankDetails {

	  public BankDetails(WebDriver driver) {
		  PageFactory.initElements( driver,this);
	}
	  
	  @FindBy(xpath = "//button[text()='+ Add New Bank']")
		 private WebElement  addnewbankaccount;
	  
	  @FindBy(css = ".bank-input-value.bank-name-input")
		 private WebElement  enterbankname;
	  
	  @FindBy(xpath = "//input[@formcontrolname='branchName']")
		 private WebElement  enterbranchname;

	  @FindBy(xpath = "//input[@formcontrolname='can']")
		 private WebElement  companyaccountnumber;
	  
	  @FindBy(xpath = "//input[@formcontrolname='ifsc']")
		 private WebElement  ifsccode;
	  
	  @FindBy(xpath = "//input[@formcontrolname='bsrCode']")
		 private WebElement  bsrcode;
	  
	  @FindBy(xpath = "//span[text()='Select Advice Template']/ancestor::button")
		 private WebElement  selecttemplate;
	  
	  @FindBy(xpath = "//span[text()='State Bank of India']")
		 private WebElement  selectbank;
	  
	  @FindBy(xpath = "//input[@formcontrolname='corporateId']")
		 private WebElement  coprateid;
	  
	  @FindBy(xpath = "//input[@formcontrolname='addrLine1']")
		 private WebElement  address1;
	  
	  @FindBy(xpath = "//input[@formcontrolname='addrLine2']")
		 private WebElement  address2;
	  
	  @FindBy(xpath = "//input[@formcontrolname='city']")
		 private WebElement  city;
	  
	  @FindBy(xpath = "//input[@formcontrolname='pinCode']")
		 private WebElement  picode;
	 
	  @FindBy(xpath = "//input[@formcontrolname='contactPerson']")
		 private WebElement  contactperson;
	  
	  @FindBy(xpath = "//input[@formcontrolname='mobile']")
		 private WebElement  moblie;
	  
	  @FindBy(xpath = "//input[@formcontrolname='email']")
		 private WebElement  email;
	  
	  @FindBy(xpath = "//input[@formcontrolname='alternateEmails']")
		 private WebElement  alternateEmails;
	  
	  @FindBy(xpath = "//button[text()='Save']")
		 private WebElement  save;
	  
	  public WebElement getAddnewbankaccount() {
		return addnewbankaccount;
	}

	public void setAddnewbankaccount(WebElement addnewbankaccount) {
		this.addnewbankaccount = addnewbankaccount;
	}

	public WebElement getEnterbankname() {
		return enterbankname;
	}

	public void setEnterbankname(WebElement enterbankname) {
		this.enterbankname = enterbankname;
	}

	public WebElement getEnterbranchname() {
		return enterbranchname;
	}

	public void setEnterbranchname(WebElement enterbranchname) {
		this.enterbranchname = enterbranchname;
	}

	public WebElement getCompanyaccountnumber() {
		return companyaccountnumber;
	}

	public void setCompanyaccountnumber(WebElement companyaccountnumber) {
		this.companyaccountnumber = companyaccountnumber;
	}

	public WebElement getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(WebElement ifsccode) {
		this.ifsccode = ifsccode;
	}

	public WebElement getBsrcode() {
		return bsrcode;
	}

	public void setBsrcode(WebElement bsrcode) {
		this.bsrcode = bsrcode;
	}

	public WebElement getSelecttemplate() {
		return selecttemplate;
	}

	public void setSelecttemplate(WebElement selecttemplate) {
		this.selecttemplate = selecttemplate;
	}

	public WebElement getSelectbank() {
		return selectbank;
	}

	public void setSelectbank(WebElement selectbank) {
		this.selectbank = selectbank;
	}

	public WebElement getCoprateid() {
		return coprateid;
	}

	public void setCoprateid(WebElement coprateid) {
		this.coprateid = coprateid;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public void setAddress1(WebElement address1) {
		this.address1 = address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public void setAddress2(WebElement address2) {
		this.address2 = address2;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getPicode() {
		return picode;
	}

	public void setPicode(WebElement picode) {
		this.picode = picode;
	}

	public WebElement getContactperson() {
		return contactperson;
	}

	public void setContactperson(WebElement contactperson) {
		this.contactperson = contactperson;
	}

	public WebElement getMoblie() {
		return moblie;
	}

	public void setMoblie(WebElement moblie) {
		this.moblie = moblie;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getAlternateEmails() {
		return alternateEmails;
	}

	public void setAlternateEmails(WebElement alternateEmails) {
		this.alternateEmails = alternateEmails;
	}

	public WebElement getSave() {
		return save;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}

	public void bankdetails() throws InterruptedException {
		 ExcelData excel=new ExcelData();
		 String bankname = excel.getstringexceldate(7, 1);
		 String branchname = excel.getstringexceldate(8, 1);
		 int companyaccountnumbe = excel.getnumericlexceldate(9, 1);
		 String ifsc = excel.getstringexceldate(10, 1);
		 int bsrcodee = excel.getnumericlexceldate(11, 1);
		 int coprateids = excel.getnumericlexceldate(12, 1);
		 String adress1 = excel.getstringexceldate(13, 1);
		 String adress2 = excel.getstringexceldate(13, 1);
		 Thread.sleep(2000);
		 addnewbankaccount.click();
		 enterbankname.sendKeys(bankname);
		 enterbranchname.sendKeys(branchname);
		 companyaccountnumber.sendKeys(Integer.toString(companyaccountnumbe));
		 ifsccode.sendKeys(ifsc);
	     bsrcode.sendKeys(Integer.toString(bsrcodee));
	     selecttemplate.click();
		 selectbank.click();
		 coprateid.sendKeys(Integer.toString(coprateids));
		 address1.sendKeys(adress1);
		 address2.sendKeys(adress2);
		 save.click();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	 
}
