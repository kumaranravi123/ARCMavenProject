package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.ArcBase;

public class ArcPageActions extends ArcBase

{
	
	public void Career_Development() throws InterruptedException
	{
	
	Actions action = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//li[@id='nav_carrer_path_parent_menu']/a"));
	action.moveToElement(ele).perform();
	driver.findElement(By.xpath("//li[@id='nav_carrer_path_menu']/a")).click();
	Thread.sleep(5000);
	driver.switchTo().frame(0);
	WebDriverWait roles = new WebDriverWait(driver, 60);
	roles.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.rolesAndCompetancies")));
	driver.findElement(By.cssSelector("input.rolesAndCompetancies")).click();
	
	}
	
	public void RolesCompetencies()
	{
		
		driver.findElement(By.xpath("//a[@class='dropdownpa']/i[@class='more-less glyphicon glyphicon-menu-down adjustArrow']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//ul[@class='main-navigation dropdownul']/child::li[1]/a/i"));
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).perform();
		

	    WebDriverWait qa = new WebDriverWait(driver, 10);
		qa.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='admsddl']/child::li[8]/a")));
		driver.findElement(By.xpath("//ul[@id='admsddl']/child::li[8]/a")).click();
	}

}
