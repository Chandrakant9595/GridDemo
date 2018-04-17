package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeGridTest {
	
	static WebDriver driver;
	static String nodeUrl, nodeUrl1;
	//eg
	@Test()
	public void secripts() throws MalformedURLException{
		
		openPage();
	}

	@BeforeTest()
	public void setUp() throws MalformedURLException{
		
		nodeUrl = "http://172.17.0.1:5555/wd/hub";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		
		/*nodeUrl1 = "http://172.18.0.1:4447/wd/hub";
		DesiredCapabilities capabilities1 = DesiredCapabilities.firefox();
		capabilities1.setBrowserName("firefox");
		capabilities1.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL(nodeUrl1), capabilities1);*/
	}
	
	
	public void openPage() throws MalformedURLException{
		
		
		driver.get("http://www.seleniumeasy.com/selenium-tutorials/how-to-configure-selenium-grid");
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.quit();
	}
}
