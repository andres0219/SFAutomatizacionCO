package PruebaSF.AutomatizacionSuccesFactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppTest 
{
	
	public void loginSF(WebDriver driver) {
		String base = "https://salesdemo4.successfactors.com/"
				+ "login?company=SFPRO000035&bplte_logout=1&_"
				+ "s.crb=pwn2KZuIhzExxDNvYUYkVW5HZ30%253d#/login";
		driver.get(base);
		driver.manage().window().maximize();
		WebElement insertarE = driver.findElement(By.id("__input1-inner"));
		insertarE.sendKeys("sfadmin");
		WebElement insertarP = driver.findElement(By.id("__input2-inner"));
		insertarP.sendKeys("part1705DC4");
		
		
		

	}
	public void Complemento(WebDriver driver) {
		WebElement button = driver.findElement(By.id("__button2-content"));
		button.click();
		WebElement Desarrollo = driver.findElement(By.xpath("//div[contains(@class,'admLinksSprite dev')]"));
		Desarrollo.click();
		WebElement Gestion = driver.findElement(By.xpath("//a[@id='94_']"));
		Gestion.click();
	}
}
