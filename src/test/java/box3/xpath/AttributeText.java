package box3.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/registerresult/1");

//WebElement createacc=driver.findElement(By.xpath("//span[text()= Create new account']")); //text function
// createacc.click();
//WebElement Fristname =driver.findElement(By.linkText("//input[@id='_R_1cl2p4jikscopb6amt2]")); // by attributes
//Fristname.sendKeys("Tom"); 
// WebElement lastname=driver.findElement(By.xpath("//input[@id=R_1k12p4jik@cppb6amHI]")); // by attributes
// lastname.sendKeys("Tom")
// WebElement submit=driver.findElement(By.xpath("//span[text() Submit'])[2]"));
// submit.click();

//xpath by contains
		WebElement register = driver.findElement(By.xpath("//div[contains(text(), 'completed)]"));
		System.out.println(register.getText());// gettext is used for getting the text
	}
}