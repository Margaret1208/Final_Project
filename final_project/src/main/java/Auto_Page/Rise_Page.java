package Auto_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rise_Page {
    private WebDriver driver;
    @FindBy(id="email")
    WebElement txtEmail;
    @FindBy (id="password")
    WebElement txtPass;
    @FindBy (xpath="//button[text()='Sign in']")
    WebElement btnSignIn;
    @FindBy(xpath = "//a[@href='https://rise.fairsketch.com/projects/all_projects']")
    WebElement btnProject;
    @FindBy (xpath="//button[text()='All projects']")
    WebElement btnAllProject;
    @FindBy (xpath="//button[@data-id='tiyhayaffv']")
    WebElement btnCompleted;
    @FindBy (xpath="//button[@data-id='nkuyhedude']")
    WebElement btnHighPriority;
    @FindBy (xpath="//button[@data-id='ohenbtrdgc']")
    WebElement btnOpenProject;
    @FindBy (xpath="//button[@data-id='gncqxkcoto']")
    WebElement btnUpcoming;
    @FindBy (xpath="(//span[@class='select2-chosen'])[2]")
    WebElement btnPage;
    @FindBy (xpath="(//div[@class='select2-result-label'])[5]")
    WebElement btnCount;


    public void CLickModuleProject(){
        btnProject.click();
    }
    public void CLickbtnAllProject() throws InterruptedException {
        btnAllProject.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Cuộn xuống cuối trang
        js.executeScript("arguments[0].scrollIntoView(true);",btnPage);
        Thread.sleep(2000);
        btnPage.click();
        Thread.sleep(2000);
        btnCount.click();
    }
    public void CLickbtnCompleted(){
        btnCompleted.click();
    }
    public void CLickbtnHighPriority(){
        btnHighPriority.click();
    }
    public void CLickbtnOpenProject() throws InterruptedException {
        btnOpenProject.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Cuộn xuống cuối trang
        js.executeScript("arguments[0].scrollIntoView(true);",btnPage);
        Thread.sleep(2000);
        btnPage.click();
        Thread.sleep(2000);
        btnCount.click();
    }
    public void CLickbtnUpcoming(){
        btnUpcoming.click();
    }

    public Rise_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void LoginFunction(String email, String pass){
        txtEmail.clear();
        txtEmail.sendKeys(email);

        txtPass.clear();
        txtPass.sendKeys(pass);
        btnSignIn.click();
    }
}
