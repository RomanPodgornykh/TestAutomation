import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SampleTest {
    public static void main(String[] args)  {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\TestAutomation\\Chromedriver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver(co);
        driver.get("http://tutorialsninja.com/demo/");
        driver.findElement(By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.row:nth-child(4) div.product-layout.col-lg-3.col-md-3.col-sm-6.col-xs-12:nth-child(2) div.product-thumb.transition div.button-group button:nth-child(1) > i.fa.fa-shopping-cart")).click();
        driver.findElement(By.cssSelector("div.container div.nav.pull-right ul.list-inline li:nth-child(4) a:nth-child(1) > i.fa.fa-shopping-cart")).click();
        driver.findElement(By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.buttons.clearfix:nth-child(8) div.pull-right > a.btn.btn-primary")).click();
        driver.findElement(By.xpath("//body/div[@id='checkout-cart']/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click();
        driver.findElement(By.cssSelector("#input-coupon")).sendKeys("123");
        //driver.findElement(By.xpath("//input[@id='button-coupon']")).click();





    }
}

