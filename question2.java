package task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the URL
		
		driver.get("https://www.demoblaze.com/");
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		// get the title of the page.
		
		String page = driver.getTitle();
		
		if (page.equals("STORE"))
			
		{
			System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page not landed on correct website");
		}
		
		}
	

}
