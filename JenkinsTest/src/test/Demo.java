package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public static void DemoClass() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\JenkinsTest\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();  
		 
		 driver.navigate().to();
		 System.out.println("welcome to learning");
		 driver.quit();
		 
	}

}
