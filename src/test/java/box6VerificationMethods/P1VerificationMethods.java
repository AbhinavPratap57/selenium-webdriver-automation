package box6VerificationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1VerificationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[@aria-label=\"Log In\"]"));
		System.out.println("Before " + loginButton.isEnabled());

		driver.findElement(By.name("email")).sendKeys("pratapabhinav613@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Abhi@123423");
		Thread.sleep(4000);
		System.out.println("After " + loginButton.isEnabled());
		
		 
		//String disabled = driver.findElement(By.xpath("//div[@aria-label='Log In']")).getAttribute("aria-disabled");
		//System.out.println(disabled);
		
	}

}
