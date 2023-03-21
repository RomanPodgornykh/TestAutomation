import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    public static void main(String[] args)  {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\TestAutomation\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        driver.quit();
    }
}

