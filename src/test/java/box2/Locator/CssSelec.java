package box2.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelec {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.cssSelector("input[name='email']"));
		Email.sendKeys("agdbcjhd");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("123344");
		WebElement loginButton = driver.findElement(By.cssSelector("div[aria-labal='Log In']"));
		loginButton.click();
	}

}
