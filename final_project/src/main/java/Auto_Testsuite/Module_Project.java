package Auto_Testsuite;

import Auto_Common.CommonBase;
import Auto_Page.Rise_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Auto_Contant.CT_Account;

import java.lang.reflect.Array;
import java.util.List;

import static org.testng.AssertJUnit.*;

public class Module_Project extends CommonBase {
    Rise_Page login = new Rise_Page(driver);
    @BeforeMethod
    public void OpenPage() {
        driver = initChromeDriver(CT_Account.RISE_URL);
    }

    @Test (priority = 1)
    public void Module_Project_Upcoming() throws InterruptedException {
        Rise_Page login = new Rise_Page(driver);
        login.LoginFunction("admin@demo.com","riseDemo");
        login.CLickModuleProject();
        login.CLickbtnUpcoming();
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td/span[@class='mt0 badge  clickable']"));
        System.out.println(elements);
        // Kiểm tra nội dung của các phần tử
        for (WebElement element : elements) {
            String elementText = element.getText();
            Assert.assertTrue(elementText.contains("Upcoming"), "Element text does not contain expected text");
            System.out.println("value " +elementText);
        }
    }

    @Test (priority = 2)
    public void Module_Project_Completed() throws InterruptedException {
        Rise_Page login = new Rise_Page(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        login.CLickModuleProject();
        login.CLickbtnCompleted();
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[8]"));
        System.out.println(elements);
        // Kiểm tra nội dung của các phần tử
        for (WebElement element : elements) {
            String elementText = element.getText();
            Assert.assertTrue(elementText.contains("Completed"), "Element text does not contain expected text");
            System.out.println("value " +elementText);
        }
    }

    @Test (priority = 3)
    public void Module_Project_All() throws InterruptedException {
        Rise_Page login = new Rise_Page(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        login.CLickModuleProject();
        login.CLickbtnAllProject();
        Thread.sleep(5000);
        String elements = String.valueOf(driver.findElements(By.xpath("//tbody/tr")).size());
        System.out.println(elements);
        WebElement element = driver.findElement(By.xpath("//div[@class='dataTables_info']"));
        String value = element.getText();
        String actual = value.substring(value.length() - 2);
        Assert.assertEquals(actual,elements);
    }
    @Test (priority = 4)
    public void Module_Project_HighPriority() throws InterruptedException {
        Rise_Page login = new Rise_Page(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        login.CLickModuleProject();
        login.CLickbtnHighPriority();
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[2]/span"));
        System.out.println(elements);
        // Kiểm tra nội dung của các phần tử
        for (WebElement element : elements) {
            String elementText = element.getText();
            Assert.assertTrue(elementText.contains("High Priority"), "Element text does not contain expected text");
            System.out.println("value " +elementText);
        }
    }

    @Test (priority = 5)
    public void Module_Project_Open() throws InterruptedException {
        Rise_Page login = new Rise_Page(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        login.CLickModuleProject();
        login.CLickbtnOpenProject();
        Thread.sleep(5000);
        List <WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[8]"));
        String length = String.valueOf(elements.size());
        System.out.println(length);
        WebElement element = driver.findElement(By.xpath("//div[@class='dataTables_info']"));
        String value = element.getText();
        String actual = value.substring(value.length() - 2);
        if(length == actual) {
            // Kiểm tra nội dung của các phần tử
            for (WebElement Element : elements) {
                String elementText = Element.getText();
                Assert.assertTrue(elementText.contains("Open"), "Element text does not contain expected text");
                System.out.println("value " +elementText);
            }
        }
    }

    @AfterMethod
    public void closeChrome() {
        closeDriver();
    }
}
