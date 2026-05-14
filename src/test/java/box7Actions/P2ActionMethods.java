package box7Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2ActionMethods {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
	Actions act = new Actions(driver);
	WebElement link = driver.findElement(By.id("click"));
	act.moveToElement(link).clickAndHold().perform();
	Thread.sleep(2000);
	act.release(link).perform();
	
}
}