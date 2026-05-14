package box6VerificationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1AssignMent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		Thread.sleep(3000);
		WebElement options = driver.findElement(By.xpath("//select[@name=\"select-default\"]"));
		Thread.sleep(2000);

		Select sel = new Select(options);
		sel.selectByVisibleText("Still learning how to count, apparently");
		Thread.sleep(2000);
		sel.selectByIndex(1);
		
		WebElement dropdown = driver.findElement(By.id("multi"));
		Select sel2 = new Select(dropdown);
		
		sel2.deselectAll();
		Thread.sleep(2000);
		sel2.selectByVisibleText("Ham");
		sel2.selectByVisibleText("Onion gravy");
	
		sel2.deselectByValue("ham");

		// select[@name=\"select-default\"]
	}

}
