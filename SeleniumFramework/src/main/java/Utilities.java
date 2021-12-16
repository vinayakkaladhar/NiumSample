import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {

    public static WebDriver driver;


    public Utilities(){
        if(System.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver","");
            driver = new ChromeDriver();
        }
    }

    public static WebDriver setDriver() {
        if (System.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "");
            if (driver == null) {
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

}
