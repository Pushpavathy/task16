package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question3 {

	public static void main(String[] args) {
		
//Launch the browser
		
				WebDriver driver = new ChromeDriver();
// Navigate to the URL
				
				driver.get("https://www.wikipedia.org/");
				
// Maximize the browser
				driver.manage().window().maximize();
				
//locate search button and perform search
				WebElement searchin =  driver.findElement(By.id("searchInput"));
				searchin.sendKeys("Artificial Intelligence",Keys.ENTER);
				
// Locate the history link and click it
				WebElement history = driver.findElement(By.partialLinkText("History"));
				history.click();
				
//Display the title of the section
				WebElement text = driver.findElement(By.id("History"));
				System.out.println(text.getText());
	}

}
