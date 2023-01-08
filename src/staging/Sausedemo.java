package staging;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sausedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver;
		driver = new EdgeDriver() ;
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//List<WebElement> myList = driver.findElements(By.className("btn"));
	
		for (int i=0;i<3;i++ ) {
		Thread.sleep(1000);
		List<WebElement> myList2 = driver.findElements(By.className("btn"));
		
		for (int t=0;t<myList2.size();t++ ) {
			myList2.get(t).click();
		}}
		
		driver.navigate().to("http://www.saucedemo.com/cart.html");
		String numberOfItem = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
		int edited_numberOfItem = Integer.parseInt(numberOfItem);
		assertEquals(edited_numberOfItem, 4);
		
		
		
		

	}

}
