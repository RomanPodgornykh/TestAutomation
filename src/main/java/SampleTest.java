import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SampleTest {
    public static void main(String[] args)  {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",""C:\IdeaProjects\TestAutomation\chromedriver.exe"");

        ChromeDriver driver = new ChromeDriver(co);
        driver.get("http://tutorialsninja.com/demo/");
        driver.findElement(By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.row:nth-child(4) div.product-layout.col-lg-3.col-md-3.col-sm-6.col-xs-12:nth-child(2) div.product-thumb.transition div.button-group button:nth-child(1) > i.fa.fa-shopping-cart")).click();
        driver.findElement(By.cssSelector("div.container div.nav.pull-right ul.list-inline li:nth-child(4) a:nth-child(1) > i.fa.fa-shopping-cart")).click();
        driver.findElement(By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.buttons.clearfix:nth-child(8) div.pull-right > a.btn.btn-primary")).click();
        driver.findElement(By.xpath("//body/div[@id='checkout-cart']/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click();
        driver.findElement(By.cssSelector("#input-coupon")).sendKeys("123");
        driver.findElement(By.cssSelector("//a[@href = '#collapse-shipping']")).click();
        Select drpRegion = new Select(driver.findElement(By.name("zone_id")));
        drpRegion.selectByVisibleText("Kent");
        driver.findElement(By.name("//input[(@name  = 'postcode')]")).sendKeys("BR6 7NZ");
        driver.findElement(By.id("//button[@id = 'button-quote']")).click();
        driver.findElement(By.cssSelector("//a[@href = '#collapse-voucher']"));
        driver.findElement(By.cssSelector("//input[@name = 'voucher']")).sendKeys("TEST");
        driver.findElement(By.cssSelector("//input[@id = 'button-voucher']")).click();
        driver.findElement(By.cssSelector("//a[@class = 'btn btn-primary']")).click();
        driver.findElement(By.linkText("//a[text() = 'Checkout']")).click();






    }
}

