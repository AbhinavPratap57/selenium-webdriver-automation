package box7Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P1BasicMouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		WebElement inputField = driver.findElement(By.id("clickable"));
		Actions act = new Actions(driver);
		act.click(inputField).perform();
		Thread.sleep(2000);
	
		act.doubleClick(inputField).perform();
		Thread.sleep(2000);
		act.contextClick(inputField).perform();
		System.out.println();
		
	}

}
