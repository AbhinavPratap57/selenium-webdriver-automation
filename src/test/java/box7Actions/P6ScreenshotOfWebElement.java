package box7Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P6ScreenshotOfWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);

		List<WebElement> icon = driver.findElements(By.xpath("//div[@class=\"css-g5y9jx r-18u37iz\"]//img[1]"));
		List<WebElement> screenName = driver.findElements(By.className("css-146c3p1"));
		int index = 0;
		for (WebElement ele : icon) {
		    File temp = ele.getScreenshotAs(OutputType.FILE);
		    Thread.sleep(1000);
		    String name = screenName.get(index).getText();
		    File perm = new File("./Screenshot/" + name + ".png");
		    Thread.sleep(1000);
		    FileHandler.copy(temp, perm);
		    index++;
		}

	}
}
