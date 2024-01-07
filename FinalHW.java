package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.HWDay14_Account;

public class FinalHW extends CommonBase {
	
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://rise.fairsketch.com/signin");
	}
	
	//Code mình hơi dài do ẩn nhiều nên đợi lâu 1 chút nhé :(
	
	@Test
	public void test_hide_1_collum() {
		pause(2000);
		type(By.xpath("//input[@id='email']"), "admin@demo.com");
		type(By.xpath("//input[@id='password']"), "riseDemo");
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//span[text()='Projects']"));
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));;
		click(By.xpath("//li[text()='Title']"));
		pause(1000);
		assertTrue(driver.findElement(By.xpath("//th[text()='ID']/following-sibling::th[text()='Client']")).isDisplayed());
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));;
		click(By.xpath("//li[text()='Client']"));
		pause(2000);
		assertTrue(driver.findElement(By.xpath("//th[text()='ID']/following-sibling::th[text()='Price']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Price']/following-sibling::th[text()='Deadline']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='ID']/following-sibling::th[text()='Status']")).isDisplayed());
		}
	
	@Test
	public void test_hide_nhieu_collum() {
		pause(2000);
		type(By.xpath("//input[@id='email']"), "admin@demo.com");
		type(By.xpath("//input[@id='password']"), "riseDemo");
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//span[text()='Projects']"));
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Start date']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Deadline']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Progress']"));
		pause(2000);
		assertTrue(driver.findElement(By.xpath("//th[text()='ID']/following-sibling::th[text()='Status']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Title']/following-sibling::th[text()='Status']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Client']/following-sibling::th[text()='Price']")).isDisplayed());
	}
	
	@Test
	public void test_hienlai_1_collum() {
		pause(2000);
		type(By.xpath("//input[@id='email']"), "admin@demo.com");
		type(By.xpath("//input[@id='password']"), "riseDemo");
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//span[text()='Projects']"));
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Deadline']"));
		pause(2000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Deadline']"));
		pause(2000);
		assertTrue(driver.findElement(By.xpath("//th[text()='Deadline']")).isDisplayed());
	}
	
	@Test
	public void test_hienlai_nhieu_collum() {
		pause(2000);
		type(By.xpath("//input[@id='email']"), "admin@demo.com");
		type(By.xpath("//input[@id='password']"), "riseDemo");
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//span[text()='Projects']"));
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Deadline']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Start date']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Progress']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Deadline']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Start date']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		click(By.xpath("//li[text()='Progress']"));
		pause(2000);
		assertTrue(driver.findElement(By.xpath("//th[text()='ID']/following-sibling::th[text()='Status']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Title']/following-sibling::th[text()='Status']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Client']/following-sibling::th[text()='Price']")).isDisplayed());
		
	}
	
	@Test
	public void test_hide_het_collum() {
		pause(2000);
		type(By.xpath("//input[@id='email']"), "admin@demo.com");
		type(By.xpath("//input[@id='password']"), "riseDemo");
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//span[text()='Projects']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='ID']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Title']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Client']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Price']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Deadline']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Start date']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Progress']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Status']"));
		pause(5000);
		assertFalse(isElementPresent(By.xpath("//li[text()='ID']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Title']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Client']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Price']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Deadline']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Start date']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Progress']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Status']")));
			
		}
	@Test
	public void test_hide_het_roi_cho_hien_lai_toan_bo_collum() {
		pause(2000);
		type(By.xpath("//input[@id='email']"), "admin@demo.com");
		type(By.xpath("//input[@id='password']"), "riseDemo");
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//span[text()='Projects']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='ID']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Title']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Client']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Price']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Deadline']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Start date']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Progress']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Status']"));
		pause(5000);
		assertFalse(isElementPresent(By.xpath("//li[text()='ID']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Title']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Client']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Price']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Deadline']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Start date']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Progress']")));
		assertFalse(isElementPresent(By.xpath("//li[text()='Status']")));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='ID']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Title']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Client']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Price']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Deadline']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Start date']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Progress']"));
		pause(1000);
		click(By.xpath("//button[@class='btn btn-default column-show-hide-popover']"));
		pause(1000);
		click(By.xpath("//li[text()='Status']"));
		pause(5000);
		assertTrue(driver.findElement(By.xpath("//th[text()='ID']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Title']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Client']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Price']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Deadline']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Start date']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Progress']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//th[text()='Status']")).isDisplayed());
	}
	
}
