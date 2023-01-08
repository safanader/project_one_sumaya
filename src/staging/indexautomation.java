package staging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class indexautomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver;
		driver = new EdgeDriver() ;
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("*[@id=\"input-one\"]")).sendKeys("safa");
		
		driver.findElement(By.xpath("//*[@id=\"input-two\"]")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"input-three\"]")).sendKeys("12345678");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/button[1]")).click();
		Thread.sleep(3000);
		

	}

}
