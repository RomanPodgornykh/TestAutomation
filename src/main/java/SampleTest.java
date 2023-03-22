import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleTest {
    public static void main(String[] args)  {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roman\\IdeaProjects\\TestAutomation\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver(co);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();

    }
}

