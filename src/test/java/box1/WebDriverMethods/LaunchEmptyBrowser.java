package box1.WebDriverMethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class LaunchEmptyBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		String title = driver.getTitle();
		Thread.sleep(2000);

		System.out.println("Title of the project : " + title);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		Thread.sleep(2000);
		
		System.out.println("Current Url is : " + url);

		String source = driver.getPageSource();
		Thread.sleep(2000);
		System.out.println("Page Source is  : " + source);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);

		driver.quit();

	}

}
