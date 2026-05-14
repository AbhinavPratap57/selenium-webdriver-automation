package box7Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P4ScrollActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement google = driver.findElement(By.linkText("Google+"));
		Point googleLocation = google.getLocation();		// Get location of element
		// Extract X and Y coordinates
		int x = googleLocation.getX();
		int y = googleLocation.getY();
		Thread.sleep(3000);
		Actions act = new Actions(driver);		// Create Actions object
		act.scrollByAmount(x, y).perform();		// Scroll to element location
		Thread.sleep(3000);
		act.click(google).perform();		// Click on element
		System.out.println(googleLocation);		// Print location
		
	}
}
