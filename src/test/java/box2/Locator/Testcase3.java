package box2.Locator;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.id("small-searchterms")).sendKeys("book");
		driver.findElement(By.className("button-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("product-box-add-to-cart-button")).click();
		Thread.sleep(2000);
		assertEquals("The product has been added to your", "The product has been added to your");
		String confirm = driver.findElement(By.xpath("//*[contains(text(),'The product has been added to your')]")).getText();;
		System.out.println(confirm);
		driver.findElement(By.className("ico-cart")).click();

		// driver.manage().window().minimize();
		// driver.close();
		// driver.quit();
	}

}
