package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArcBase
{
	public static WebDriver driver;
	
	public void ChromeInitiation() throws InterruptedException
	{
	

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://arc.emids.com/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	
	}

}
