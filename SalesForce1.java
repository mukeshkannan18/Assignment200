package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce1 {
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
		
		WebElement newdash=driver.findElement(By.xpath("//div[text()='New Dashboard']"));
		newdash.click();
		
		WebElement frame=driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
		driver.switchTo().frame(frame);
		
		WebElement name=driver.findElement(By.id("dashboardNameInput"));
		name.sendKeys("salesforce automated by mukesh");
		
		WebElement submit=driver.findElement(By.id("submitBtn"));
		submit.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		
		WebElement frametwo=driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
		driver.switchTo().frame(frametwo);
		
		WebElement savebutton=driver.findElement(By.xpath("//button[text()='Save']"));
		savebutton.click();
		String savetitle=driver.getTitle();
		System.out.println(savetitle);
		
		WebElement donebutton=driver.findElement(By.xpath("//button[text()='Done']"));
		donebutton.click();
		String donetitle=driver.getTitle();
		System.out.println(donetitle);
		
		if(savetitle.equals(donetitle)) {
			System.out.println("the new dashboard created successfully");
		}
		
	}

}
