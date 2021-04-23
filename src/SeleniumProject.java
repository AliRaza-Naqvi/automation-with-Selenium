import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Test
public class SeleniumProject
{
    @Test
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver","C:/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/?ir=1");
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://login.salesforce.com/?locale=in");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.salesforce.com/in/form/trial/freetrial/?d=70130000000Enyk");
        driver.findElement(By.name("UserFirstName")).click();
        driver.findElement(By.name("UserFirstName")).sendKeys("abc");

        driver.findElement(By.name("UserLastName")).click();
        driver.findElement(By.name("UserLastName")).sendKeys("xyz");

        driver.findElement(By.name("UserEmail")).click();
        driver.findElement(By.name("UserEmail")).sendKeys("ada@gmail.com");
        // String drop = driver.FindElement(By.Id("")).SendKeys("");

        //job title dropdown  -- usertitle
        driver.findElement(By.name("UserTitle")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select jobtitle = new Select(driver.findElement(By.name("UserTitle")));
        jobtitle.selectByValue("Developer");

        //company name
        driver.findElement(By.name("CompanyName")).click();
        driver.findElement(By.name("CompanyName")).sendKeys("ABC Software Solution");


        //employes dropdown
        driver.findElement(By.name("CompanyEmployees")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Select emp = new Select(driver.findElement(By.name("CompanyEmployees")));
        emp.selectByValue("75");


        //phone
        driver.findElement(By.name("UserPhone")).click();
        driver.findElement(By.name("UserPhone")).sendKeys("0123456789");

        //agree checkbox
        driver.findElement(By.className("checkbox-ui")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //submit button
        driver.findElement(By.name("Start free trial")).click();

        String afterlogin = driver.getCurrentUrl();
        System.out.println(afterlogin);
        driver.navigate().to(afterlogin);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

        // dropdown ---   jobtitle - employes - country
    }

}
