package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeautyPage {
	WebDriver driver;
	public BeautyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[4]")
//	WebElement beautydropdown;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[4]/ul/li[3]/a")
	WebElement beautydropdown;
	@FindBy(xpath="//*[@id=\\\"category_filter\\\"]/div/ul/li[1]/div/div/label/input")
	WebElement cat_filter;
	@FindBy(xpath="//*[@id=\\\"stock_filter\\\"]/div/ul/li/div/div/div/label/input")
	WebElement filter_stock;
	@FindBy(xpath="//*[@id=\\\"algolia_hits\\\"]/div/div/ol/li[1]/div/form/button")
	WebElement addedcart;
	
	public void clickdropdown()
	{
		Actions act=new Actions(driver);
	    WebElement beautymainMenu= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[4]"));
	    act.moveToElement(beautymainMenu).perform();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    beautydropdown.click();
	}
	public void choose_haircare()
	{
		
		cat_filter.click();
	}
	public void check_exclude_out_of_stock()
	{
	
		filter_stock.click();
	}
	public void added_cart()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	      
	    // WebElement discount= driver.findElement(By.xpath("//*[@id=\"sort_container\"]/button[4]"));
	    //  js.executeScript("arguments[0].scrollIntoView()", discount);
	   //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      WebElement filters= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div[2]/div/h2/span"));
	      js.executeScript("arguments[0].scrollIntoView()", filters);
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      addedcart.click();
	}

}
