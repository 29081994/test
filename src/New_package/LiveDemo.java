package New_package;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;





public class LiveDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement>elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		List<String>originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>newList=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(newList));

	}

}
