package org.m2i.folibarr.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDolibarr {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Before
	public void setup (){
		//On instancie le driver
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.testlogiciel.pro/dolibarr/index.php");
		driver.findElement(By.id("username")).sendKeys("jsmith");
		driver.findElement(By.id("password")).sendKeys("hp");
		driver.findElement(By.className("button")).click();
		
	}
	
	@After
	public void tearDown() {
		driver.findElement(By.cssSelector("img.login")).click();
		driver.close();
	}
	

	/*
	@Test 
	public void testConnexion() {
		Assert.assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
		driver.findElement(By.cssSelector("img.login")).click();
		driver.close();
	}
	*/
	@Test
	public void test() {
	
		driver.findElement(By.id("mainmenua_companies")).click();
		driver.findElement(By.linkText("Nouveau tiers")).click();
		driver.findElement(By.name("nom")).sendKeys("Linux 2");
		driver.findElement(By.name("firstname")).sendKeys("Jean Michel");
		new Select (driver.findElement(By.name("civilite_id"))).selectByVisibleText("Docteur");
		driver.findElement(By.name("address")).sendKeys("1 rue test");
		driver.findElement(By.id("zipcode")).sendKeys("29200");
		driver.findElement(By.id("town")).sendKeys("Brest");
		driver.findElement(By.xpath("//input[@value='Créer tiers']")).click();
		driver.findElement(By.linkText("Liste clients")).click();
		driver.findElement(By.name("search_zipcode")).sendKeys("29200");
		driver.findElement(By.xpath("//input[@value='Rechercher']")).click();
		//Assert.assertEquals("Afficher société: Linux 2",driver.findElement(By.linkText("Linux 2")).getText());
		//driver.close();
		//driver.findElement(By.tit).click();
		
		
		
		
		
	}
	
}
