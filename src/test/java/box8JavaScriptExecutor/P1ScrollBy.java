package box8JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1ScrollBy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)"); //origin to 500 pixel down 
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1700)");//those point the previous scroll to 1700 pixel down 
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		System.out.println("ScrollBy completed");
		jse.executeScript("window.scrollTo(0,350)");//origin to 350 pixel down
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,1300)");//origin to 1300 pixel down
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,2300)");//origin to 2300 pixel down
		System.out.println("ScrollTo completed");


		
	}

}
