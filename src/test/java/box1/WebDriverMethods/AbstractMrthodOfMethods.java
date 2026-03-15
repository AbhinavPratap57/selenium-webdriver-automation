package box1.WebDriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractMrthodOfMethods {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://www.instagram.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.manage().window().getSize();

		int height = driver.manage().window().getSize().getHeight();

		int width = driver.manage().window().getSize().getWidth();

		Dimension loc = driver.manage().window().getSize();

		Point poc = driver.manage().window().getPosition();

		System.out.println(height);

		System.out.println("size is " + loc);

		// System.out.println(poc);

		Thread.sleep(2000);

		driver.manage().window().minimize();

		Thread.sleep(2000);
		driver.close();  
	}
}
