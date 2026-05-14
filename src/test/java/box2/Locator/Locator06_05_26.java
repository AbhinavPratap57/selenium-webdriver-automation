package box2.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator06_05_26 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@tabindex='0' and text()='Mobiles']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Laptops ')]")).click();
		
		// driver.manage().window().minimize();
		// driver.close();
		// driver.quit();

	}

}
