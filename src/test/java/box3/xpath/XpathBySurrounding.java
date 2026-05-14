package box3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurrounding {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(6000);
		WebElement departure = driver.findElement(By.id("ddate"));
		departure.click();
		WebElement date = driver.findElement(By.xpath("//div[text()='Mar 2026']/../..//li[text()='21']"));
		date.click();
	}

}
