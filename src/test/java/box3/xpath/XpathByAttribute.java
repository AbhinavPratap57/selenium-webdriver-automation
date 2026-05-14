package box3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement createAccount = driver.findElement(By.xpath("//span[text()= 'Create new account']"));
		createAccount.click();
		Thread.sleep(2000);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='R_1cl2p4jikacppb6amH1_']"));
		// mobileNumber.click();
		firstName.sendKeys("Tim");

		WebElement surname = driver.findElement(By.xpath("//input[@id='_R_1kl2p4jikacppb6amH1_']"));
		surname.sendKeys("Tommy");

		WebElement submitBtn = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		submitBtn.click();
	}
}
