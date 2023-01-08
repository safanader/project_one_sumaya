package staging;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_page {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver;
		driver = new EdgeDriver() ;
		driver.get("https://www.facebook.com");
		String myTitle = driver.getTitle();
		System.out.println(myTitle.toUpperCase().substring(0,8));
		
		
		List<String> title = new ArrayList<>();
		
	}





}
