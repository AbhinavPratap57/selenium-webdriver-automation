package box2.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomDm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement registerlink = driver.findElement(By.linkText("Register"));
		registerlink.click();
		Thread.sleep(2000);

		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click(); // click is used to click the button
		Thread.sleep(2000);

		WebElement Name = driver.findElement(By.name("FirstName"));
		Name.sendKeys("Tom"); // sendkeys is used to enter the data
		Thread.sleep(2000);

		WebElement lastname = driver.findElement(By.name("LastName"));
		lastname.sendKeys("Jerry");
		WebElement mail = driver.findElement(By.name("Email"));
		mail.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement Pass = driver.findElement(By.id("Password"));
		Pass.sendKeys("123qwe");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}