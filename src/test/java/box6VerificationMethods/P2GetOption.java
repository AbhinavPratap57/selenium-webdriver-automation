package box6VerificationMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class P2GetOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		WebElement dropdown = driver.findElement(By.name("multi"));
		Select sel = new Select(dropdown);

		List<WebElement> options = sel.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		sel.deselectAll();
		sel.selectByValue("onion gravy");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		WebElement dropdown1 = driver.findElement(By.name("select_empty_multiple"));
		Select sel2 = new Select(dropdown1);
		//
		sel2.selectByValue("select_2");
		sel2.getAllSelectedOptions();
	}

}
