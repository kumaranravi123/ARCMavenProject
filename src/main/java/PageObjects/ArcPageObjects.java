package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.ArcBase;

public class ArcPageObjects extends ArcBase

{
	
	public void PointsClick() throws InterruptedException
	{
		
		driver.switchTo().frame(3);
		driver.findElement(By.name("username")).sendKeys("kumaranr");
		driver.findElement(By.name("password")).sendKeys("Emids1993");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);	
     	driver.findElement(By.cssSelector("li.points-counter")).click();
     	Thread.sleep(4000);
		
		List<WebElement> leader = driver.findElements(By.xpath("//p[contains(@class, 'leader-name')]"));
		
		System.out.println("\n");
		   
		  for (WebElement leaders : leader)
		  {
			  System.out.println(leaders.getText());
		      if (leaders.getText().contains("Kumaran"))
		      {
		    	  break;
		         }  
		  }

	}
	
	
	public void RankClick() throws InterruptedException
	{
		
		 WebDriverWait rank = new WebDriverWait(driver, 20);
		 rank.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.rank-counter")));
		 driver.findElement(By.cssSelector("li.rank-counter")).click();
		 Thread.sleep(5000);
	     List<WebElement> ele11 = driver.findElements(By.xpath("//h4[contains(@class,'link-adding-ellipse res-username')]/a"));
	     List<WebElement> ele22 = driver.findElements(By.xpath("//div[contains(@class,'leaderboard user-points')]/p[2]/span"));
	    
	     System.out.println("\n");
	     
	     for (int i = 0; i < 10; i++)
	     {
	    	 System.out.println(ele11.get(i).getText() + " " + "-" + " " + ele22.get(i).getText() + " " + "POINTS");
	     }
	}
	
	
	public void RolesCompetenciesPrint()
	{
		
		System.out.println("\n");
		WebElement qa1 = driver.findElement(By.xpath("//a[@id='saactive']/span"));
		System.out.println(qa1.getText());
		
		System.out.println("\n");
		WebElement qaroles = driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[1]/a"));
		System.out.println(qaroles.getText() + ":-");
		
		driver.findElement(By.xpath("//li[@id='samenu']/a")).click();
		System.out.println("\n");
		
		WebElement element1 = driver.findElement(By.xpath("//div[@id='collapseOne']/child::div/child::div/child::ul"));
		String t1 = element1.getAttribute("textContent");
		System.out.println(t1.trim());
		
		WebElement element2 = driver.findElement(By.xpath("//div[@id='collapseTwo']/child::div/child::div/child::ul"));
		String t2 = element2.getAttribute("textContent");
		System.out.println(t2.trim());
		
		WebElement element3 = driver.findElement(By.xpath("//div[@id='collapseThr']/child::div/child::div/child::ul"));
		String t3 = element3.getAttribute("textContent");
		System.out.println(t3.trim());
		
		WebElement element4 = driver.findElement(By.xpath("//div[@id='collapseFour']/child::div/child::div/child::ul"));
		String t4 = element4.getAttribute("textContent");
		System.out.println(t4.trim());
		
		WebElement element5 = driver.findElement(By.xpath("//div[@id='collapseFv']/child::div/child::div/child::ul"));
		String t5 = element5.getAttribute("textContent");
		System.out.println(t5.trim());
		
		
		
    	driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		WebElement qacompetencies = driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a"));
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
			
		WebElement element6 = driver.findElement(By.xpath("//div[@id='collapseOne1']/child::div/child::div"));
		String c1 = element6.getAttribute("textContent");
		System.out.println(c1.trim());
		
		WebElement element7 = driver.findElement(By.xpath("//div[@id='collapseTwo1']/child::div/child::div"));
		String c2 = element7.getAttribute("textContent");
		System.out.println(c2.trim());
		
		WebElement element8 = driver.findElement(By.xpath("//div[@id='collapseThr1']/child::div/child::div"));
		String c3 = element8.getAttribute("textContent");
		System.out.println(c3.trim());			
		
		WebElement element9 = driver.findElement(By.xpath("//div[@id='collapseFour1']/child::div/child::div"));
		String c4 = element9.getAttribute("textContent");
		System.out.println(c4.trim());
		
		WebElement element10 = driver.findElement(By.xpath("//div[@id='collapseFv1']/child::div/child::div"));
		String c5 = element10.getAttribute("textContent");
		System.out.println(c5.trim());
		
		WebElement element11 = driver.findElement(By.xpath("//div[@id='collapseSix1']/child::div/child::div"));
		String c6 = element11.getAttribute("textContent");
		System.out.println(c6.trim());
		
		
		
		System.out.println("\n");
		WebElement qa2 = driver.findElement(By.xpath("//a[@id='aactive']/span"));
		System.out.println(qa2.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
		driver.findElement(By.xpath("//li[@id='amenu']/a")).click();
		System.out.println("\n");
		
		WebElement element12 = driver.findElement(By.xpath("//div[@id='collapseaaOne']/child::div/child::div/child::ul"));
		String t6 = element12.getAttribute("textContent");
		System.out.println(t6.trim());
		
		WebElement element13 = driver.findElement(By.xpath("//div[@id='collapseaaTwo']/child::div/child::div/child::ul"));
		String t7 = element13.getAttribute("textContent");
		System.out.println(t7.trim());
		
		WebElement element14 = driver.findElement(By.xpath("//div[@id='collapseaaThr']/child::div/child::div/child::ul"));
		String t8 = element14.getAttribute("textContent");
		System.out.println(t8.trim());
		
		WebElement element15 = driver.findElement(By.xpath("//div[@id='collapseaaFour']/child::div/child::div/child::ul"));
		String t9 = element15.getAttribute("textContent");	
		System.out.println(t9.trim());
		
		WebElement element16 = driver.findElement(By.xpath("//div[@id='collapseaaFv']/child::div/child::div/child::ul"));
		String t10 = element16.getAttribute("textContent");
		System.out.println(t10.trim());
		
		WebElement element17 = driver.findElement(By.xpath("//div[@id='collapseaaSix']/child::div/child::div/child::ul"));
		String t11 = element17.getAttribute("textContent");
		System.out.println(t11.trim());
		
		WebElement element18 = driver.findElement(By.xpath("//div[@id='collapseaaSev']/child::div/child::div/child::ul"));
		String t12 = element18.getAttribute("textContent");
		System.out.println(t12.trim());
		
		WebElement element19 = driver.findElement(By.xpath("//div[@id='collapseaaEight']/child::div/child::div/child::ul"));
		String t13 = element19.getAttribute("textContent");
		System.out.println(t13.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element20 = driver.findElement(By.xpath("//div[@id='collapseaaOne1']/child::div/child::div"));
		String c7 = element20.getAttribute("textContent");
		System.out.println(c7.trim());
		
		WebElement element21 = driver.findElement(By.xpath("//div[@id='collapseaaTwo1']/child::div/child::div"));
		String c8 = element21.getAttribute("textContent");
		System.out.println(c8.trim());
		
		WebElement element22 = driver.findElement(By.xpath("//div[@id='collapseaaThr1']/child::div/child::div"));
		String c9 = element22.getAttribute("textContent");
		System.out.println(c9.trim());			
		
		WebElement element23 = driver.findElement(By.xpath("//div[@id='collapseaaFour1']/child::div/child::div"));
		String c10 = element23.getAttribute("textContent");
		System.out.println(c10.trim());
		
		WebElement element24 = driver.findElement(By.xpath("//div[@id='collapseaaFv1']/child::div/child::div"));
		String c11 = element24.getAttribute("textContent");
		System.out.println(c11.trim());
		
		WebElement element25 = driver.findElement(By.xpath("//div[@id='collapseaaSix1']/child::div/child::div"));
		String c12 = element25.getAttribute("textContent");
		System.out.println(c12.trim());
		
		
		
		System.out.println("\n");
		WebElement qa3 = driver.findElement(By.xpath("//a[@id='aaactive']/span"));
		System.out.println(qa3.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
	    driver.findElement(By.xpath("//li[@id='aamenu']/a")).click();
		System.out.println("\n");
	    
		WebElement element26 = driver.findElement(By.xpath("//div[@id='collapsesqlOne']/child::div/child::div/child::ul"));
		String t14 = element26.getAttribute("textContent");
		System.out.println(t14.trim());
		
		WebElement element27 = driver.findElement(By.xpath("//div[@id='collapsesqlTwo']/child::div/child::div/child::ul"));
		String t15 = element27.getAttribute("textContent");
		System.out.println(t15.trim());
		
		WebElement element28 = driver.findElement(By.xpath("//div[@id='collapsesqlThr']/child::div/child::div/child::ul"));
		String t16 = element28.getAttribute("textContent");
		System.out.println(t16.trim());
		
		WebElement element29 = driver.findElement(By.xpath("//div[@id='collapsesqlFour']/child::div/child::div/child::ul"));
		String t17 = element29.getAttribute("textContent");
		System.out.println(t17.trim());
		
		WebElement element30 = driver.findElement(By.xpath("//div[@id='collapsesqlFv']/child::div/child::div/child::ul"));
		String t18 = element30.getAttribute("textContent");
		System.out.println(t18.trim());
		
		WebElement element31 = driver.findElement(By.xpath("//div[@id='collapsesqlSix']/child::div/child::div/child::ul"));
		String t19 = element31.getAttribute("textContent");
		System.out.println(t19.trim());
		
		WebElement element32 = driver.findElement(By.xpath("//div[@id='collapsesqlSev']/child::div/child::div/child::ul"));
		String t20 = element32.getAttribute("textContent");
		System.out.println(t20.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element33 = driver.findElement(By.xpath("//div[@id='collapsesqlOne1']/child::div/child::div"));
		String c13 = element33.getAttribute("textContent");
		System.out.println(c13.trim());
		
		WebElement element34 = driver.findElement(By.xpath("//div[@id='collapsesqlTwo1']/child::div/child::div"));
		String c14 = element34.getAttribute("textContent");
		System.out.println(c14.trim());
		
		WebElement element35 = driver.findElement(By.xpath("//div[@id='collapsesqlThr1']/child::div/child::div"));
		String c15 = element35.getAttribute("textContent");
		System.out.println(c15.trim());			
		
		WebElement element36 = driver.findElement(By.xpath("//div[@id='collapsesqlFour1']/child::div/child::div"));
		String c16 = element36.getAttribute("textContent");
		System.out.println(c16.trim());
		
		WebElement element37 = driver.findElement(By.xpath("//div[@id='collapsesqlFv1']/child::div/child::div"));
		String c17 = element37.getAttribute("textContent");
		System.out.println(c17.trim());
		
		WebElement element38 = driver.findElement(By.xpath("//div[@id='collapsesqlSix1']/child::div/child::div"));
		String c18 = element38.getAttribute("textContent");
		System.out.println(c18.trim());
		
		
		
		System.out.println("\n");
		WebElement qa4 = driver.findElement(By.xpath("//a[@id='stlactive']/span"));
		System.out.println(qa4.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
	    driver.findElement(By.xpath("//li[@id='stlmenu']/a")).click();
	    System.out.println("\n");
		
		WebElement element39 = driver.findElement(By.xpath("//div[@id='collapsetlOne']/child::div/child::div/child::ul"));
		String t21 = element39.getAttribute("textContent");
		System.out.println(t21.trim());
			
		WebElement element40 = driver.findElement(By.xpath("//div[@id='collapsetlTwo']/child::div/child::div/child::ul"));
		String t22 = element40.getAttribute("textContent");
		System.out.println(t22.trim());
			
		WebElement element41 = driver.findElement(By.xpath("//div[@id='collapsetlThr']/child::div/child::div/child::ul"));
		String t23 = element41.getAttribute("textContent");
		System.out.println(t23.trim());
			
		WebElement element42 = driver.findElement(By.xpath("//div[@id='collapsetlFour']/child::div/child::div/child::ul"));
		String t24 = element42.getAttribute("textContent");
		System.out.println(t24.trim());
			
		WebElement element43 = driver.findElement(By.xpath("//div[@id='collapsetlFv']/child::div/child::div/child::ul"));
		String t25 = element43.getAttribute("textContent");
		System.out.println(t25.trim());
			
		WebElement element44 = driver.findElement(By.xpath("//div[@id='collapsetlSix']/child::div/child::div/child::ul"));
		String t26 = element44.getAttribute("textContent");
		System.out.println(t26.trim());
		
		WebElement element45 = driver.findElement(By.xpath("//div[@id='collapsetlSev']/child::div/child::div/child::ul"));
		String t27 = element45.getAttribute("textContent");
		System.out.println(t27.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element46 = driver.findElement(By.xpath("//div[@id='collapsetlOne1']/child::div/child::div"));
		String c19 = element46.getAttribute("textContent");
		System.out.println(c19.trim());
		
		WebElement element47 = driver.findElement(By.xpath("//div[@id='collapsetlTwo1']/child::div/child::div"));
		String c20 = element47.getAttribute("textContent");
		System.out.println(c20.trim());
		
		WebElement element48 = driver.findElement(By.xpath("//div[@id='collapsetlThr1']/child::div/child::div"));
		String c21 = element48.getAttribute("textContent");
		System.out.println(c21.trim());		
		
		WebElement element49 = driver.findElement(By.xpath("//div[@id='collapsetlFour1']/child::div/child::div"));
		String c22 = element49.getAttribute("textContent");
		System.out.println(c22.trim());
		
		WebElement element50 = driver.findElement(By.xpath("//div[@id='collapsetlFv1']/child::div/child::div"));
		String c23 = element50.getAttribute("textContent");
		System.out.println(c23.trim());
		
		WebElement element51 = driver.findElement(By.xpath("//div[@id='collapsetlSix1']/child::div/child::div"));
		String c24 = element51.getAttribute("textContent");
		System.out.println(c24.trim());
		
		
		
		System.out.println("\n");
		WebElement qa5 = driver.findElement(By.xpath("//a[@id='tlactive']/span"));
		System.out.println(qa5.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
	    driver.findElement(By.xpath("//li[@id='tlmenu']/a")).click();
	    System.out.println("\n");
		
		WebElement element52 = driver.findElement(By.xpath("//div[@id='collapseatlOne']/child::div/child::div/child::ul"));
		String t28 = element52.getAttribute("textContent");
		System.out.println(t28.trim());
			
		WebElement element53 = driver.findElement(By.xpath("//div[@id='collapseatlTwo']/child::div/child::div/child::ul"));
		String t29 = element53.getAttribute("textContent");
		System.out.println(t29.trim());
			
		WebElement element54 = driver.findElement(By.xpath("//div[@id='collapseatlThr']/child::div/child::div/child::ul"));
		String t30 = element54.getAttribute("textContent");
		System.out.println(t30.trim());
			
		WebElement element55 = driver.findElement(By.xpath("//div[@id='collapseatlFour']/child::div/child::div/child::ul"));
		String t31 = element55.getAttribute("textContent");
		System.out.println(t31.trim());
			
		WebElement element56 = driver.findElement(By.xpath("//div[@id='collapseatlFv']/child::div/child::div/child::ul"));
		String t32 = element56.getAttribute("textContent");
		System.out.println(t32.trim());
			
		WebElement element57 = driver.findElement(By.xpath("//div[@id='collapseatlSix']/child::div/child::div/child::ul"));
		String t33 = element57.getAttribute("textContent");
		System.out.println(t33.trim());
		
		WebElement element58 = driver.findElement(By.xpath("//div[@id='collapseatlSev']/child::div/child::div/child::ul"));
		String t34 = element58.getAttribute("textContent");
		System.out.println(t34.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element59 = driver.findElement(By.xpath("//div[@id='collapseatlOne1']/child::div/child::div"));
		String c25 = element59.getAttribute("textContent");
		System.out.println(c25.trim());
		
		WebElement element60 = driver.findElement(By.xpath("//div[@id='collapseatlTwo1']/child::div/child::div"));
		String c26 = element60.getAttribute("textContent");
		System.out.println(c26.trim());
		
		WebElement element61 = driver.findElement(By.xpath("//div[@id='collapseatlThr1']/child::div/child::div"));
		String c27 = element61.getAttribute("textContent");
		System.out.println(c27.trim());			
		
		WebElement element62 = driver.findElement(By.xpath("//div[@id='collapseatlFour1']/child::div/child::div"));
		String c28 = element62.getAttribute("textContent");
		System.out.println(c28.trim());
		
		WebElement element63 = driver.findElement(By.xpath("//div[@id='collapseatlFv1']/child::div/child::div"));
		String c29 = element63.getAttribute("textContent");
		System.out.println(c29.trim());
		
		WebElement element64 = driver.findElement(By.xpath("//div[@id='collapseatlSix1']/child::div/child::div"));
		String c30 = element64.getAttribute("textContent");
		System.out.println(c30.trim());
		
		
		
		System.out.println("\n");
		WebElement qa6 = driver.findElement(By.xpath("//a[@id='atlactive']/span"));
		System.out.println(qa6.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
	    driver.findElement(By.xpath("//li[@id='atlmenu']/a")).click();
	    System.out.println("\n");
		
		WebElement element65 = driver.findElement(By.xpath("//div[@id='collapsesseOne']/child::div/child::div/child::ul"));
		String t35 = element65.getAttribute("textContent");
		System.out.println(t35.trim());
			
		WebElement element66 = driver.findElement(By.xpath("//div[@id='collapsesseTwo']/child::div/child::div/child::ul"));
		String t36 = element66.getAttribute("textContent");
		System.out.println(t36.trim());
			
		WebElement element67 = driver.findElement(By.xpath("//div[@id='collapsesseThr']/child::div/child::div/child::ul"));
		String t37 = element67.getAttribute("textContent");
		System.out.println(t37.trim());
			
		WebElement element68 = driver.findElement(By.xpath("//div[@id='collapsesseFour']/child::div/child::div/child::ul"));
		String t38 = element68.getAttribute("textContent");
		System.out.println(t38.trim());
			
		WebElement element69 = driver.findElement(By.xpath("//div[@id='collapsesseFv']/child::div/child::div/child::ul"));
		String t39 = element69.getAttribute("textContent");
		System.out.println(t39.trim());
			
		WebElement element70 = driver.findElement(By.xpath("//div[@id='collapsesseSix']/child::div/child::div/child::ul"));
		String t40 = element70.getAttribute("textContent");
		System.out.println(t40.trim());
		
		WebElement element71 = driver.findElement(By.xpath("//div[@id='collapsesseSev']/child::div/child::div/child::ul"));
		String t41 = element71.getAttribute("textContent");
		System.out.println(t41.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element72 = driver.findElement(By.xpath("//div[@id='collapsesseOne1']/child::div/child::div"));
		String c31 = element72.getAttribute("textContent");
		System.out.println(c31.trim());
		
		WebElement element73 = driver.findElement(By.xpath("//div[@id='collapsesseTwo1']/child::div/child::div"));
		String c32 = element73.getAttribute("textContent");
		System.out.println(c32.trim());
		
		WebElement element74 = driver.findElement(By.xpath("//div[@id='collapsesseThr1']/child::div/child::div"));
		String c33 = element74.getAttribute("textContent");
		System.out.println(c33.trim());		
		
		WebElement element75 = driver.findElement(By.xpath("//div[@id='collapsesseFour1']/child::div/child::div"));
		String c34 = element75.getAttribute("textContent");
		System.out.println(c34.trim());
		
		WebElement element76 = driver.findElement(By.xpath("//div[@id='collapsesseFv1']/child::div/child::div"));
		String c35 = element76.getAttribute("textContent");
		System.out.println(c35.trim());
		
		WebElement element77 = driver.findElement(By.xpath("//div[@id='collapsesseSix1']/child::div/child::div"));
		String c36 = element77.getAttribute("textContent");
		System.out.println(c36.trim());
		
		
		
		System.out.println("\n");
		WebElement qa7 = driver.findElement(By.xpath("//a[@id='sseactive']/span"));
		System.out.println(qa7.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
	    driver.findElement(By.xpath("//li[@id='ssemenu']/a")).click();
	    System.out.println("\n");
		
		WebElement element78 = driver.findElement(By.xpath("//div[@id='collapseteOne']/child::div/child::div/child::ul"));
		String t42 = element78.getAttribute("textContent");
		System.out.println(t42.trim());
			
		WebElement element79 = driver.findElement(By.xpath("//div[@id='collapseteTwo']/child::div/child::div/child::ul"));
		String t43 = element79.getAttribute("textContent");
		System.out.println(t43.trim());
			
		WebElement element80 = driver.findElement(By.xpath("//div[@id='collapseteThr']/child::div/child::div/child::ul"));
		String t44 = element80.getAttribute("textContent");
		System.out.println(t44.trim());
			
		WebElement element81 = driver.findElement(By.xpath("//div[@id='collapseteFour']/child::div/child::div/child::ul"));
		String t45 = element81.getAttribute("textContent");
		System.out.println(t45.trim());
			
		WebElement element82 = driver.findElement(By.xpath("//div[@id='collapseteFv']/child::div/child::div/child::ul"));
		String t46 = element82.getAttribute("textContent");
		System.out.println(t46.trim());
			
		WebElement element83 = driver.findElement(By.xpath("//div[@id='collapseteSix']/child::div/child::div/child::ul"));
		String t47 = element83.getAttribute("textContent");
		System.out.println(t47.trim());
		
		WebElement element84 = driver.findElement(By.xpath("//div[@id='collapseteSev']/child::div/child::div/child::ul"));
		String t48 = element84.getAttribute("textContent");
		System.out.println(t48.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element85 = driver.findElement(By.xpath("//div[@id='collapseteOne1']/child::div/child::div"));
		String c37 = element85.getAttribute("textContent");
		System.out.println(c37.trim());
		
		WebElement element86 = driver.findElement(By.xpath("//div[@id='collapseteTwo1']/child::div/child::div"));
		String c38 = element86.getAttribute("textContent");
		System.out.println(c38.trim());
		
		WebElement element87 = driver.findElement(By.xpath("//div[@id='collapseteThr1']/child::div/child::div"));
		String c39 = element87.getAttribute("textContent");
		System.out.println(c39.trim());			
		
		WebElement element88 = driver.findElement(By.xpath("//div[@id='collapseteFour1']/child::div/child::div"));
		String c40 = element88.getAttribute("textContent");
		System.out.println(c40.trim());
		
		WebElement element89 = driver.findElement(By.xpath("//div[@id='collapseteFv1']/child::div/child::div"));
		String c41 = element89.getAttribute("textContent");
		System.out.println(c41.trim());
		
		WebElement element90 = driver.findElement(By.xpath("//div[@id='collapseteSix1']/child::div/child::div"));
		String c42 = element90.getAttribute("textContent");
		System.out.println(c42.trim());
		
		
		
		System.out.println("\n");
		WebElement qa8 = driver.findElement(By.xpath("//a[@id='seactive']/span"));
		System.out.println(qa8.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
	    driver.findElement(By.xpath("//li[@id='semenu']/a")).click();
	    System.out.println("\n");
		
		WebElement element91 = driver.findElement(By.xpath("//div[@id='collapseaseOne']/child::div/child::div/child::ul"));
		String t49 = element91.getAttribute("textContent");
		System.out.println(t49.trim());
			
		WebElement element92 = driver.findElement(By.xpath("//div[@id='collapseaseTwo']/child::div/child::div/child::ul"));
		String t50 = element92.getAttribute("textContent");
		System.out.println(t50.trim());
			
		WebElement element93 = driver.findElement(By.xpath("//div[@id='collapseaseThr']/child::div/child::div/child::ul"));
		String t51 = element93.getAttribute("textContent");
		System.out.println(t51.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element94 = driver.findElement(By.xpath("//div[@id='collapseaseOne1']/child::div/child::div"));
		String c43 = element94.getAttribute("textContent");
		System.out.println(c43.trim());
		
		WebElement element95 = driver.findElement(By.xpath("//div[@id='collapseaseTwo1']/child::div/child::div"));
		String c44 = element95.getAttribute("textContent");
		System.out.println(c44.trim());
		
		WebElement element96 = driver.findElement(By.xpath("//div[@id='collapseaseThr1']/child::div/child::div"));
		String c45 = element96.getAttribute("textContent");
		System.out.println(c45.trim());		
		
		WebElement element97 = driver.findElement(By.xpath("//div[@id='collapseaseFour1']/child::div/child::div"));
		String c46 = element97.getAttribute("textContent");
		System.out.println(c46.trim());
		
		WebElement element98 = driver.findElement(By.xpath("//div[@id='collapseaseFv1']/child::div/child::div"));
		String c47 = element98.getAttribute("textContent");
		System.out.println(c47.trim());
		
		
		
		System.out.println("\n");
		WebElement qa9 = driver.findElement(By.xpath("//a[@id='aseactive']/span"));
		System.out.println(qa9.getText());
		
		System.out.println("\n");
		System.out.println(qaroles.getText() + ":-");
		
	    driver.findElement(By.xpath("//li[@id='asemenu']/a")).click();
	    System.out.println("\n");
		
		WebElement element99 = driver.findElement(By.xpath("//div[@id='collapsetseOne']/child::div/child::div/child::ul"));
		String t52 = element99.getAttribute("textContent");
		System.out.println(t52.trim());
			
		WebElement element100 = driver.findElement(By.xpath("//div[@id='collapsetseTwo']/child::div/child::div/child::ul"));
		String t53 = element100.getAttribute("textContent");
		System.out.println(t53.trim());
		
		
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]/a")).click();
		System.out.println("\n");
		
		System.out.println(qacompetencies.getText() + ":-");
		System.out.println("\n");
		
		WebElement element101 = driver.findElement(By.xpath("//div[@id='collapsetseOne1']/child::div/child::div"));
		String c48 = element101.getAttribute("textContent");
		System.out.println(c48.trim());
		
		WebElement element102 = driver.findElement(By.xpath("//div[@id='collapsetseTwo1']/child::div/child::div"));
		String c49 = element102.getAttribute("textContent");
		System.out.println(c49.trim());
		
		WebElement element103 = driver.findElement(By.xpath("//div[@id='collapsetseThr1']/child::div/child::div"));
		String c50 = element103.getAttribute("textContent");
		System.out.println(c50.trim());			
		
		WebElement element104 = driver.findElement(By.xpath("//div[@id='collapsetseFour1']/child::div/child::div"));
		String c51 = element104.getAttribute("textContent");
		System.out.println(c51.trim());
		
		WebElement element105 = driver.findElement(By.xpath("//div[@id='collapsetseFv1']/child::div/child::div"));
		String c52 = element105.getAttribute("textContent");
		System.out.println(c52.trim());
		
	}
	     
}
