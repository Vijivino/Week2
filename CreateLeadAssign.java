package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("webex");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vijaya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("laxmi");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("viji");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("learning coding");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vijayalaxmivinothkumar19@gmail.com");
		//WebElement ch = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select sp =new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
        sp.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
	}

}
