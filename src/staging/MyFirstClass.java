package staging;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;



		public class MyFirstClass {

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver;
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();

				driver.get("https:\\www.saucedemo.com/");

				driver.manage().window().maximize();

				driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");

				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

//				driver.findElement(By.className("btn")).click();
				List<WebElement> MyList = driver.findElements(By.className("btn"));

				for (int i = 0; i < MyList.size(); i++) {
					MyList.get(i).click();

				}

				driver.navigate().to("https://www.saucedemo.com/cart.html");

				String numberOfItems = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

				int theEditednumberofItems = Integer.parseInt(numberOfItems);

				if (theEditednumberofItems == 6) {

					System.out.println("test case is passed");
				} else {
					System.out.println("faield ");
				}

				Assert.assertEquals(theEditednumberofItems, 3);

			}

		

	}


