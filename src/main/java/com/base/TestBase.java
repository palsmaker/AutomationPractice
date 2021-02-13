package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Dhrubajyoti\\Desktop\\Mid-Spring 2020 Selenium\\AutomationTest\\src\\main\\java\\com\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
		
		public static void initialization() {
			String browserName = prop.getProperty("browser");
		
			if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
			driver = new ChromeDriver();
			}
			else if (browserName.equals("firefox")) {
				System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
				
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_TIME_WAIT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
		
	}


}
