package task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch firefox
		WebDriver driver = new FirefoxDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		
		driver.get("https://www.google.com/");
		
		//Print the current url
		
		System.out.println("Current URL:" + driver.getCurrentUrl());
		
		//reloads the page
		
		driver.navigate().refresh();
		
		System.out.println("Current URL:" + driver.getCurrentUrl());
		
		// close the browser
		
		driver.close();
		
	}

}
