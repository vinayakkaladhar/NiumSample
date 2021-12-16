import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.uncommons.*;

public class NiumHome extends NiumHomePage  {
     public WebDriver driver;
     public NiumHomePage niumHomePage;

     @BeforeMethod
    public void setPrerequisites(){
         niumHomePage = new NiumHomePage();
         driver.get("https://www.nium.com/");
     }

     @Test (description = "testing nium home page", priority = 1, dataProvider = "login")
    public void testNiumHomePage(){
         Reporter.log("test case started");
         Assert.assertTrue(niumHomePage.selectHomePage(),"home icon not displayed");
         Reporter.log("test case ended");
     }

     @DataProvider(name = "login")
    public Object[][] login(){
         return new Object[][]{{"vinayak","Rajini@123"}};
     }

}
