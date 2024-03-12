package automation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Functionaltesting {
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

	
}
	@Test
	public void functionaltest() throws Exception {
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("mui-1"));
		username.sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.id("mui-2"));
		pwd.sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
		
		WebElement orderbtn = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root has-submenu compactNavItem css-46up3a']"));
		orderbtn.click();
		Thread.sleep(2000);
		
		WebElement order = driver.findElement(By.xpath("(//button[@class=\"MuiButtonBase-root css-1hytwp4\"]//span[@class='sidenavHoverShow MuiBox-root css-i9zxpg'])[2]"));
		order.click();
		Thread.sleep(2000);
		
		WebElement bulkodr = driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-vwfva9']"));
		bulkodr.click();
		Thread.sleep(2000);
		
		//System.out.println("s s");
		WebElement fileUploadElement = driver.findElement(By.id("mui-7"));
		//String filePath = "D:\\File\\demo-data.xlsx";
		fileUploadElement.sendKeys("D:\\File\\demo-data.xlsx");
		
		Thread.sleep(2000);
		WebElement importbtn = driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']"));
		importbtn.click();
		Thread.sleep(2000);
		WebElement validate = driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']"));
		validate.click();
		
		Thread.sleep(2000);
		driver.switchTo( ).alert( ).accept();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		this.takeSnapShot(driver, "D:\\File\\screenshot.png");
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