package staging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver;
		driver = new EdgeDriver() ;
		driver.get("http://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("Dubai");
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		


	}

}
