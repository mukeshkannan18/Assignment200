package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce3 {
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
		
		WebElement search=driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']"));
		search.sendKeys("automated by mukesh");
		
		Thread.sleep(5000);
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div/div/div[2]/div/div[2]/lightning-datatable/div[2]/div/div/table/tbody/tr/td[6]/lightning-primitive-cell-factory/span/div/lightning-primitive-cell-actions/lightning-button-menu"));
		Actions move=new Actions(driver);
		move.moveToElement(dropdown).perform();
		dropdown.click();
		
		WebElement button=driver.findElement(By.xpath("//span[text()='Delete']"));
		
		button.click();
		
		WebElement delete=driver.findElement(By.xpath("(//span[text()='Delete'])[2]"));
		delete.click();
		
		
		
		
		
       
		

	}

}


