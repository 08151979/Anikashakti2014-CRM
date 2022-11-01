package variosConsept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	 static WebDriver driver;
	public static void main(String[]args) {
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negLoginTest();
		tearDown();
		
	}
     public static void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
 		driver.manage().deleteAllCookies();
 		driver.get("https://techfios.com/billing/?ng=admin/");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 		
    	 
     }
     public static void loginTest() {
        driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
 		driver.findElement(By.id("password")).sendKeys("abc123");
 		driver.findElement(By.name("login")).click();
    	 
     }
     public static void negLoginTest() {
    	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
  		driver.findElement(By.id("password")).sendKeys("abc1234");
  		driver.findElement(By.name("login")).click();
    	 
     }
     public static void tearDown() {
    	 driver.close();
    	 driver.quit();
     }
     
}
