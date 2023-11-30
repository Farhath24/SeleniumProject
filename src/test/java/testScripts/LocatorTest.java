package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		List<WebElement> elements=driver.findElements(By.xpath("//td[text='B.Wagner']//following-sibling::td"));
		for(WebElement cellItems:elements)
		{
			System.out.println(cellItems.getText());
		}
		

	}

}
