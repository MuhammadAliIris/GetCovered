package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/Selenium material/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		String BaseURL ="https://client-dev-v2.getcoveredinsurance.com/";
		    
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(BaseURL); 
        
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        //Click Register
        WebElement Register = driver.findElement(By.xpath("//*[@id=\"top-of-app\"]/div/div[3]/a[2]"));
        Register.click();
        
     // explicit wait condition
     //WebDriverWait w = new WebDriverWait(driver, 10);
     
     // presenceOfElementLocated condition
     //w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//*[@id=\"top-of-app\"]/div/div[3]/a[2]")));
     
     // get text of element and print
     //System.out.println("Element present having text:" + Register.getText());
        
        
        
        
        Thread.sleep(1000);
        //Click Email Input field
        driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("muhammad.ali+1@citrusbits.com");
        
        Thread.sleep(2000);
        //Password
        driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Asdf@1234");
        
        Thread.sleep(1000);
        //Confirm Password
	    driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("Asdf@1234");
        
	    Thread.sleep(1000);
	    //First Name
	    driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("Muhammad");
	    
	    Thread.sleep(1000);
	    //Last Name
	    driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("Ali");
	    
	    Thread.sleep(1000);
	    // DOB
	    driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("01/11/1992");
	    
	    Thread.sleep(1000);
	    //Phone Number
	    driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]")).sendKeys("3125675868");
	    
	    //T&C checkbox
	    WebElement chkbox = driver.findElement(By.xpath("//*[@id=\"terms_conditions\"]"));
	    chkbox.click();
	    
	  //Login and Save
	    driver.findElement(By.xpath("/html/body/app-root/article/div/app-register/div/form/button")).click();
	    
	    
	  	    
	
	
	
	}

}
