package automation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Uitesting {
	
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
		}else{
			//If no browser is passed throw exception
			throw new Exception("Incorrect Browser");
			}
//			driver.manage().timeouts().getImplicitWaitTimeout();
	
	}
	@Test
	public void testParameterWithXML1() throws Throwable{
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		WebElement url1 = driver.findElement(By.linkText("https://www.getcalley.com/"));
		url1.click();				
			
		System.out.println("Desktop Resolutions");
		Thread.sleep(1000);
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-HH.mm.ss");
		String currentDateTime = dateFormat.format(currentDate);
//		
		System.out.println(currentDateTime);
		String e=".png";
		driver.manage().window().setSize(new Dimension(1090,1080));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1090x1080//Screenshot1-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1090x1080//Screenshot1-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1366,768));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1366x768//Screenshot1-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1366x768//Screenshot1-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1536,864));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1536x864//Screenshot1-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1536x864//Screenshot1-"+currentDateTime+e);
		
		
		System.out.println("Mobile Resolutions");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(360,640));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//360x640//Screenshot1-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//360x640//Screenshot1-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(414,896));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//414x896//Screenshot1-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//414x896//Screenshot1-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(375,667));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//375x667//Screenshot1-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//375x667//Screenshot1-"+currentDateTime+e);
		
	
	
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(1000);
		WebElement url2 = driver.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/"));
		url2.click();				
			
		
//		
		
		driver.manage().window().setSize(new Dimension(1090,1080));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1090x1080//Screenshot2-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1090x1080//Screenshot2-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1366,768));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1366x768//Screenshot2-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1366x768//Screenshot2-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1536,864));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1536x864//Screenshot2-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1536x864//Screenshot2-"+currentDateTime+e);
		
		System.out.println("Mobile Resolutions");
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(360,640));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//360x640//Screenshot2-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//360x640//Screenshot2-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(414,896));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//414x896//Screenshot2-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//414x896//Screenshot2-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(375,667));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//375x667//Screenshot2-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//375x667//Screenshot2-"+currentDateTime+e);
		
	
	
	
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		WebElement url3 = driver.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/"));
		url3.click();				
			
		
		driver.manage().window().setSize(new Dimension(1090,1080));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1090x1080//Screenshot3-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1090x1080//Screenshot3-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1366,768));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1366x768//Screenshot3-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1366x768//Screenshot3-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1536,864));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1536x864//Screenshot3-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1536x864//Screenshot3-"+currentDateTime+e);
		
		System.out.println("Mobile Resolutions");
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(360,640));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//360x640//Screenshot3-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//360x640//Screenshot3-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(414,896));
		this.takeSnapShot(driver, "D://Chrome//414x896//Screenshot3-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//414x896//Screenshot3-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(375,667));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//375x667//Screenshot3-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//375x667//Screenshot3-"+currentDateTime+e);
		
	
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(1000);
		WebElement url4 = driver.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/"));
		url4.click();				
			
		
		driver.manage().window().setSize(new Dimension(1090,1080));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1090x1080//Screenshot4-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1090x1080//Screenshot4-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1366,768));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1366x768//Screenshot4-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1366x768//Screenshot4-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1536,864));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1536x864//Screenshot4-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1536x864//Screenshot4-"+currentDateTime+e);
		
		System.out.println("Mobile Resolutions");
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(360,640));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//360x640//Screenshot4-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//360x640//Screenshot4-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(414,896));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//414x896//Screenshot4-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//414x896//Screenshot4-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(375,667));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//375x667//Screenshot4-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//375x667//Screenshot4-"+currentDateTime+e);
		
		

		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Thread.sleep(1000);
		WebElement url5 = driver.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/"));
		url5.click();				
			
		
//		
		
		driver.manage().window().setSize(new Dimension(1090,1080));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1090x1080//Screenshot5-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1090x1080//Screenshot5-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1366,768));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1366x768//Screenshot5-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1366x768//Screenshot5-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(1536,864));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//1536x864//Screenshot5-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//1536x864//Screenshot5-"+currentDateTime+e);
		
		System.out.println("Mobile Resolutions");
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(360,640));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//360x640//Screenshot5-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//360x640//Screenshot5-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(414,896));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//414x896//Screenshot5-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//414x896//Screenshot5-"+currentDateTime+e);
		Thread.sleep(1000);
		
		
		driver.manage().window().setSize(new Dimension(375,667));
		Thread.sleep(1000);
		this.takeSnapShot(driver, "D://Chrome//375x667//Screenshot5-"+currentDateTime+e);
		this.takeSnapShot(driver, "D://Firefox//375x667//Screenshot5-"+currentDateTime+e);
		
		
	}
	
	public  void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
	
	@AfterMethod
	public void  endtest() {
		driver.close();
	}
  
  
}
