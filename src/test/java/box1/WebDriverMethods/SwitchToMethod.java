package box1.WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/35");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// Thread.sleep(15000);
		String parantId = driver.getWindowHandle();
		System.out.println(parantId);
//		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		Set<String> sessionIds = driver.getWindowHandles();
		System.out.println(sessionIds);
		// driver.switchTo().window();
		sessionIds.remove(parantId); // remove the session id of the parent

		for (String id : sessionIds) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
//			driver.manage().window().maximize();
//			Thread.sleep(3000);

			String title = driver.getTitle();
			Thread.sleep(2000);
			System.out.println(title);
			// driver.close();

		}
driver.quit();
	}

}
