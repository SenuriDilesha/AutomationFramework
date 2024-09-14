import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginTC {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		//driver.getTitle();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//driver.close();
		
		String x = driver.getTitle();
		String y = "OrangeHRM";
//		if(x == "OrangeHRM") {
//			System.out.println("Successfully logging to the OrangeHRM");
//		}
//		else {
//			System.out.println("Something went wrong");
//		}
//		driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]"));
//		
		
		Assert.assertEquals(y, x);
		
		driver.close();

	}

}
