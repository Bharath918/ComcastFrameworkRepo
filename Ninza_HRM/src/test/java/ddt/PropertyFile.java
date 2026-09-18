package ddt;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFile {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream fis= new FileInputStream("./src/test/resources/CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println("URL : "+prop.getProperty("url"));
		System.out.println("UserName :"+ prop.getProperty("userName"));
		System.out.println("Password :"+ prop.getProperty("password"));
		
		WebDriver driver;
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			driver= new ChromeDriver();
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			driver= new FirefoxDriver();
		else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
			driver= new EdgeDriver();
		else
			driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("userName"));
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputPassword")).clear();
		driver.findElement(By.id("inputPassword")).sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
