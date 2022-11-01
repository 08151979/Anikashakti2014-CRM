package variosConsept;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	WebDriver driver;
	@Before
	public  void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
 		 driver = new ChromeDriver();
 		driver.manage().deleteAllCookies();
 		driver.get("https://techfios.com/billing/?ng=admin/");
    	 driver.manage().window().maximize();
     }
     @Test
     public void loginTest() {
    	 driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
  		driver.findElement(By.id("password")).sendKeys("abc123");
  		driver.findElement(By.name("login")).click();
    	 
     }
     @After
     public void tearDown() {
    	 driver.close();
    	 driver.quit();
     }

}
