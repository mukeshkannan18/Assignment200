package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("hari.radhakrishnan@qeagle.com");
			
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Leaf@123");
		
		WebElement login=driver.findElement(By.id("Login"));
		login.click();
		
		WebElement menu=driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		menu.click();

		WebElement viewall=driver.findElement(By.xpath("//button[text()='View All']"));
		viewall.click();
		
		
		WebElement dash=driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li"));
		dash.click();
		
		WebElement sortorder=driver.findElement(By.xpath("//span[text()='Dashboard Name']"));
		Actions sort=new Actions(driver);
		sort.moveToElement(sortorder).perform();
		sortorder.click();
}
}