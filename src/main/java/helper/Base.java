package helper;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {
	public static Properties prop;
	public static WebDriver driver;

	static {
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/resources/bank.properties");
			prop = new Properties();
			prop.load(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Before
	public void setup() {
		String browserName = prop.getProperty("browser");
		switch (browserName) {
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			driver = new ChromeDriver();
			break;
		case "firefox":
			FirefoxOptions option1 = new FirefoxOptions();
			option1.addArguments("--incognito");
			driver = new FirefoxDriver();
			break;
		case "Edge":
			EdgeOptions option2 = new EdgeOptions();
			option2.addArguments("--incognito");
			driver = new EdgeDriver();
			break;

		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

	public void selectDropdown(WebElement ele, String value, String type) {
		Select s = new Select(ele);
		switch (type) {
		case "visible":
			s.selectByVisibleText(value);
			break;
		case "index":
			s.deselectByIndex(Integer.parseInt(value));
			break;
		case "value":
			s.selectByValue(value);
			break;
		}
	}

	public void actionMethod(WebElement ele, String methodtype) {
		Actions a = new Actions(driver);

		switch (methodtype) {
		case "moushover":
			a.moveToElement(ele).build().perform();
			break;
		case "click":
			a.click(ele).build().perform();
		}

	}

	public void bootStrapDropedown(List<WebElement> list, String value) {
		for (WebElement ele : list) {
			String eleText = ele.getText();
			if (eleText.equals(value)) {
				ele.click();
				break;
			}
		}
	}

	public void handelAlert(String type) {
		waitforelement(10, "alert", null);
		Alert aa = driver.switchTo().alert();
		switch (type) {
		case "accept":
			aa.accept();
			break;
		case "dismiss":
			aa.dismiss();
			break;
		}
	}

	public void waitforelement(int timeout, String condition, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		switch (condition) {
		case "alert":
			wait.until(ExpectedConditions.alertIsPresent());
			break;
		case "clickable":
			wait.until(ExpectedConditions.elementToBeClickable(ele));

		}
	}

	public void clickOnElement(WebElement ele) {
		waitforelement(20, "clickable", ele);
		try {
			ele.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments(0).click();", ele);
		}
	}

	public void validateText(WebElement ele, String expected) {
		String actualValue = ele.getText();
		assertEquals(actualValue, expected);
	}

	@After
	public void tearDown(Scenario s) throws IOException {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("Screenshots/" + s.getName() + ".png"));
		}
		driver.quit();
	}

	public void switchwindow(String title) {
		Set<String> allwindow = driver.getWindowHandles();
		for (String s : allwindow) {
			driver.switchTo().window(s);
			String currentTitle = driver.getTitle();
			if (currentTitle.equals(title)) {
				break;
			}
		}

	}
}
