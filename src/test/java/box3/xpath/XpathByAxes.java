package box3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.xpath("//input[@type=\"submit\"]/preceding-sibling :: input"));
		search.sendKeys("ABC");
		WebElement button = driver
				.findElement(By.xpath("//input[@id=\"small-searchterms\"]/following-sibling:: input"));
		button.click();
	}
}
