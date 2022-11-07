package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        
		System.setProperty("webdriver.chrome.driver", "C:/Softwares/Selenium material/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://client-dev-v2.getcoveredinsurance.com/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("URL Loaded");
		//Login Email
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("muhammad.ali+1@citrusbits.com");
	    System.out.println("Login email typed");
	   
	    //Login Password
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("Asdf@1234");
        System.out.println("Password typed");
        
        // Click Login button
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/article/div/app-login/form/div[2]/div/button")).click();
        System.out.println("Login has completed succesfully");

        
        //driver.findElement(By.className("mat-btn warning test-login")))
        
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //WebElement Login =  driver.findElement(By.xpath("/html/body/app-root/article/div/app-login/form/div[2]/div"));

         //this line will scroll down to make element visible
        //js.executeScript("window.scrollTo(" + Login.getLocation().x + "," +(Login.getLocation().y- 100) + ");");
        
        
        
        
        //----------------------User Profile Update-----------------------
        
        //Title field
        
        driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Mr. Muhammad Ali");
        
        //Middle Name
        driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Muhammad Ali");
        
        
        
        
        
        
        
        
	}

}
