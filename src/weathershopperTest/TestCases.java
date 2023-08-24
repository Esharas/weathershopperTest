package weathershopperTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestCases {
	
	
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private JavascriptExecutor js;

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    js = (JavascriptExecutor) driver;
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://weathershopper.pythonanywhere.com/");
	    try {
	      assertEquals(driver.getTitle(), "Current Temperature");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Current temperature'])[1]/following::h3[1]")).click();
	    try {
	      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Current temperature'])[1]/following::h3[1]")).getText(), "Moisturizers");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Buy moisturizers'])[1]/following::h3[1]")).click();
	    try {
	      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Buy moisturizers'])[1]/following::h3[1]")).getText(), "Sunscreens");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    try {
	      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Moisturizers'])[1]/following::button[1]")).getAttribute("value"), "");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    try {
	      assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sunscreens'])[1]/following::button[1]")).getAttribute("value"), "");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Moisturizers'])[1]/following::button[1]")).click();
	    try {
	      assertEquals(driver.getTitle(), "The Best Moisturizers in the World!");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    try {
	      assertEquals(driver.findElement(By.xpath("//button[@onclick=\"addToCart('Alexander Almond & Honey Moisturiser',360)\"]")).getAttribute("value"), "");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Empty'])[1]/following::div[2]")).click();
	    try {
	      assertEquals(driver.findElement(By.xpath("//button[@onclick='goToCart()']")).getAttribute("value"), "");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sunscreens'])[1]/following::button[1]")).click();
	    try {
	      assertEquals(driver.getTitle(), "The Best Sunscreens in the World!");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    assertEquals(driver.findElement(By.xpath("//button[@onclick=\"addToCart('Vishy La Shield Sunscreen spf-30',195)\"]")).getAttribute("value"), "");
	    driver.findElement(By.xpath("//button[@onclick=\"addToCart('Vishy La Shield Sunscreen spf-30',195)\"]")).click();
	    try {
	      assertEquals(driver.findElement(By.xpath("//button[@onclick='goToCart()']")).getAttribute("value"), "");
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    driver.findElement(By.xpath("//button[@onclick=\"addToCart('Magnus Resistant Sunscreen SPF-30',140)\"]")).click();
	  }

	  private void assertEquals(String attribute, String string) {
		// TODO Auto-generated method stub
		
	}

	@AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private void fail(String verificationErrorString) {
		// TODO Auto-generated method stub
		
	}

	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }   
	
}
