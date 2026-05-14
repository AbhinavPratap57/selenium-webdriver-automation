package box3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/81");
		Thread.sleep(15000);
		WebElement CheckBox = driver.findElement(By.id("Check Delivery"));
		CheckBox.sendKeys("134567");
	}
}
