package box1.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.flipkart.com/");
Thread.sleep(3000);
driver.navigate().to("https://www.amazon.com/");
Thread.sleep(3000);
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
driver.navigate().to("https://www.instagram.com/");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
driver.manage().window().minimize();
Thread.sleep(3000);
driver.close();
}

}
