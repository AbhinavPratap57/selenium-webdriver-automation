package box2.Locator;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_1h5l6n6pcldcpbn6b5ipamH1_']")).sendKeys("8268276561");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_1hll6n6pcldcpbn6b5ipamH1_']")).sendKeys("AP7607369675");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label=\"Log In\"]")).click();
		
	}

}
