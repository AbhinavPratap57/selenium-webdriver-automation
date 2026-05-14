package box8Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("search-box-button")).click();
		Thread.sleep(3000);
		System.out.println("Alert Popup...to handle it ..ok button");
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.close();

}
}