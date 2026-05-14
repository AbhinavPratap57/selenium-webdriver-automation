package box7Actions;

import java.io.File;
import java.io.IOException;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P5TakesScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		TakesScreenshot tks = (TakesScreenshot) driver;// step1
		File temp = tks.getScreenshotAs(OutputType.FILE);// step2
		File perm = new File("./Screenshot/A/Amazonpage.png");// step3
		FileHandler.copy(temp, perm);// step4

		WebElement furniture = driver.findElement(By.xpath("//img[@alt='Min. 50% off | Office furniture']"));
		File temp1 = furniture.getScreenshotAs(OutputType.FILE);// step2
		File perm1 = new File("./Screenshot/A/Amazonfurniture.png");// step3
		FileHandler.copy(temp1, perm1);// step4
		driver.close();

	}
}
