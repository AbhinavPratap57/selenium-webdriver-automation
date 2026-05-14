package box2.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator30_04_26 {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//TC 01		
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.id("small-searchterms")).sendKeys("AbhinavPratap");
//		driver.findElement(By.className("search-box-button")).click();;
//		Thread.sleep(3000);
//TC 02
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Abhinav");
		driver.findElement(By.id("LastName")).sendKeys("Pratap");
		driver.findElement(By.id("Email")).sendKeys("pratap123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pratap123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pratap123");
		driver.findElement(By.id("register-button")).click();
		driver.manage().window().minimize();
		driver.close();
		driver.quit();
	
}

}
