package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.poifs.property.Parent;
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
public static RemoteWebDriver driver;

public static Properties prop ;


	public void loadObjects() {
		 
		 try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void unloadObjects() {
		prop=null;
	}

	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
				 driver = new ChromeDriver();
				
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//System.out.println("The browser "+ browser+ " is launched with the url "+url+ " successfully.");
			reportStep("The browser "+ browser+ " is launched with the url "+url+ " successfully.", "pass");
		} catch ( SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+ " is not launched due to url does not have http/https");
			reportStep("The browser "+browser+ " is not launched due to url does not have http/https", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The broswer "+browser+ " is not launched due to unknown error");
			reportStep("The broswer "+browser+ " is not launched due to unknown error", "fail");
		}
		
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+ " is entered the data "+data+ " successfully");
			reportStep("The element with id "+idValue+ " is entered the data "+data+ " successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in application");
			reportStep("The element with id "+idValue+" is not visible in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+ " is not stable in the application");
			reportStep("The element with id "+idValue+ " is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered "+data+" due to unexpected alert opened");
			reportStep("The element with id "+idValue+" is not entered "+data+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered "+data+ " due to unknown error");
			reportStep("The element with id "+idValue+" is not entered "+data+ " due to unknown error", "fail");
		}
			
		}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+ nameValue+" is entered data "+ data+" successfully");
			reportStep("The element with name "+ nameValue+" is entered data "+ data+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in application");
			reportStep("The element with name "+nameValue+" is not visible in application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The elememt with name "+nameValue+" is not entered data "+data+" due to unexpected alert opened");
			reportStep("The elememt with name "+nameValue+" is not entered data "+data+" due to unexpected alert opened", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered data "+data+" due to unknown error", "fail");
		}
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered the data "+data+" successfully");
			reportStep("The element with xpath "+xpathValue+" is entered the data "+data+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the aplication");
			reportStep("The element with xpath "+xpathValue+" is not visible in the aplication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+ " is not intractable in application");
			reportStep("The element with xpath "+xpathValue+ " is not intractable in application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+ " is not stable in the application");
			reportStep("The element with xpath "+xpathValue+ " is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+ " is not entered data "+data+" due to unexpected alert opened");\
			reportStep("The element with xpath "+xpathValue+ " is not entered data "+data+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered data "+data+" due to unknown error", "fail");
		}
		
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
		   String iptitle =  driver.getTitle();
		   
		   if (title.equals(iptitle)) {
			//System.out.println("The title of the page "+iptitle+" is matched with expected title "+title+" successfully");
			reportStep("The title of the page "+iptitle+" is matched with expected title "+title+" successfully", "pass");
		   } else { 
		    //System.out.println("The title of the page "+iptitle+" is not matched with the expected title "+title); // updated
			   reportStep("The title of the page "+iptitle+" is not matched with the expected title "+title, "pass");
		   }
			
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with title "+title+ " is not verified due to unknown error");
			reportStep("The element with title "+title+ " is not verified due to unknown error", "fail");
		}
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
	
	try {
		String verifiedtext = 	driver.findElementById(id).getText();
		if(verifiedtext.equals(text)) {
			//System.out.println("The element with id "+id+" is holding the text "+verifiedtext+" is matched with expected text "+text);
			reportStep("The element with id "+id+" is holding the text "+verifiedtext+" is matched with expected text "+text, "pass");
		}else {
			//System.err.println("The element with id  "+id+ " is holding the text "+ verifiedtext+ " is not matched with the expected text "+text);
			reportStep("The element with id  "+id+ " is holding the text "+ verifiedtext+ " is not matched with the expected text +text", "pass");
		}
	    }catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		    //System.err.println("The element with id "+id+" is not found in the DOM");
	    	reportStep("The element with id "+id+" is not found in the DOM", "fail");
	    }catch (ElementNotVisibleException e) {
			// TODO: handle exception
	    	//System.err.println("The element with id "+id+" is not visible in the application.");
	    	reportStep("The element with id "+id+" is not visible in the application.", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified the text "+text+" due to unexpected alert opened");
			reportStep("The element with id "+id+" is not verified the text "+text+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+ " is not verified the text "+text+" due to unnknown error");
			reportStep("The element with id "+id+ " is not verified the text "+text+" due to unnknown error", "fail");
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String texttoverify=  driver.findElementByXPath(xpath).getText();
			if (text.equals(texttoverify)) {
				//System.out.println("The element with xpath "+xpath+ " is holding the text "+texttoverify+" is matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+ " is holding the text "+texttoverify+" is matched with the expected text "+text, "pass");
			} else {
			    //System.err.println("The element with xpath  "+xpath+" is holding the text "+ texttoverify+" is not matched the expected text "+text);
			    reportStep("The element with xpath  "+xpath+" is holding the text "+ texttoverify+" is not matched the expected text "+text, "pass");
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+ " is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "pass");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is  not interactable in the application");
			reportStep("The element with xpath "+xpath+" is  not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified the text "+text+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not verified the text "+text+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+"is not verified the text "+text+" due to unknown error");
			reportStep("The element with xpath "+xpath+"is not verified the text "+text+" due to unknown error", "fail");
		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String  textcont = driver.findElementByXPath(xpath).getText();
			if (textcont.contains(text)) {
				//System.out.println("The element with xpath  "+xpath+" is holding the text"+textcont+ " which contains expected text "+text);
				reportStep("The element with xpath  "+xpath+" is holding the text"+ textcont + " which contains expected text "+text, "pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+textcont+" which doesn't contains expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+textcont+" which doesn't contains expected text"+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not foound in the DOM");
			reportStep("The element with xpath "+xpath+" is not foound in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application" );
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+ " is not interactable in the application");
		      reportStep("The element with xpath "+xpath+ " is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the applicaiton");
			reportStep("The element with xpath "+xpath+" is not stable in the applicaiton", text);
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified the text "+text+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not verified the text "+text+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified the text "+text+" due to unexpected error");
			reportStep("The element with xpath "+xpath+" is not verified the text "+text+" due to unexpected error", "fail");
		}
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked successfully");
			reportStep("The element with id "+id+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+ " is not found in the DOM");
			reportStep("The element with id "+id+ " is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked");
			reportStep("The element with id "+id+" is not clicked", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+ " is not visible in the application");
			reportStep("The element with id "+id+ " is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to unexpected alert opened");
			reportStep("The element with id "+id+" is not clicked due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is  not clicked due to unknown error");
			reportStep("The element with id "+id+" is  not clicked due to unknown error", "fail");
		}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is clicked successfully");
			reportStep("The element with classname "+classVal+" is clicked successfully", "pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.err.println("The element with classname "+classVal+" is not found in the DOM");
			reportStep("The element with classname "+classVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not visible in the application");
			reportStep("The element with classname "+classVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clicked");
			reportStep("The element with classname "+classVal+" is not clicked", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not interactable in the application");
			reportStep("The element with classname "+classVal+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clicked due to unexpected alert is opened");
			reportStep("The element with classname "+classVal+" is not clicked due to unexpected alert is opened", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+ " is not stable in the applicaiton");
			reportStep("The element with classname "+classVal+ " is not stable in the applicaiton", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+ " is not clicked due to unknown error");
			reportStep("The element with classname "+classVal+ " is not clicked due to unknown error", "fail");
		}
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked successfully");
			reportStep("The element with name "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+ name+" is not clicked");
			reportStep("The element with name "+ name+" is not clicked", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+ " is not visible in the application");
			reportStep("The element with name "+name+ " is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked to unexpected alert opened");
			reportStep("The element with name "+name+" is not clicked to unexpected alert opened", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is  not stable in the application");
			  reportStep("The element with name "+name+" is  not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name \"+name+\" is not clicked due to unknown error", "fail");
		}
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();;
			//System.out.println("The element with link "+name+" is clicked successfully");
			reportStep("The element with link "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked");
			reportStep("The element with link "+name+" is not clicked", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the applicaiton");
			reportStep("The element with link "+name+" is not visible in the applicaiton", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+ " is not stable in the application");
			reportStep("The element with link "+name+ " is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+ " is not clicked due to unexpected alert opened");
			reportStep("The element with link "+name+ " is not clicked due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element witht link "+name+" is not clicked due to unknown error");
			reportStep("The element witht link "+name+" is not clicked due to unknown error", "fail");
		}
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();;
			//System.out.println("The elememnt with link "+name+" is clicked successfully");
			reportStep("The elememnt with link "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		   // System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application");
			reportStep("The element with link "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clickable in the application");
			reportStep("The element with link "+name+" is not clickable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The elememt with link "+name+" is not clicked due to unexpected alert opened");
			reportStep("The elememt with link "+name+" is not clicked due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked to unknown error");
			reportStep("The element with link "+name+" is not clicked to unknown error", "fail");
		}
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not visible in DOM");
			reportStep("The element with xpath "+xpathVal+" is not visible in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the applicaition");
			reportStep("The element with xpath "+xpathVal+" is not visible in the applicaition", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the applicaiton");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the applicaiton", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unexpected alert got opened");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass", false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail",false);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found in the application");
			reportStep("The element with xpath "+xpathVal+" is not found in the application", "fail",false);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application", "fail",false);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail",false);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail",false);
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+ "is not clicked due to unexpected alert opened");
			reportStep("The element with xpath "+xpathVal+ "is not clicked due to unexpected alert opened", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error	");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error	", "fail",false);
		}
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String gettext = null;  
		try {
			 gettext =  driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is holidng the text "+gettext);
			 reportStep("The element with id "+idVal+" is holidng the text "+gettext, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element  with id "+idVal+" is not found in the DOM");
			reportStep("The element  with id "+idVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in application");
			reportStep("The element with id "+idVal+" is not stable in application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not able to retrive the text due to unexpected alert opened");
			reportStep("The element with id "+idVal+" is not able to retrive the text due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not able to retrive the text due to unknown error");
			reportStep("The element with id "+idVal+" is not able to retrive the text due to unknown error", "fail");
		}
	    return gettext; 
	
	}
	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String gettextbyxpath = null;
		try {
			 gettextbyxpath =  driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" is holding the text "+gettextbyxpath);
			 reportStep("The element with xpath "+xpathVal+" is holding the text "+gettextbyxpath, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+ " is not able to retrive the text due to unexpected alert got opened");
			reportStep("The element with xpath "+xpathVal+ " is not able to retrive the text due to unexpected alert got opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not able to retrive the text due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not able to retrive the text due to unknown error", "fail");
		}
		return gettextbyxpath;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropele =  driver.findElementById(id);
			Select iddrop = new Select(dropele);
			iddrop.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected the value "+value+" by using visible text" );
			reportStep("The element with id "+id+" is selected the value "+value+" by using visible text" , "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.out.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not able to select the value "+value+" in the dropdown");
			reportStep("The element with id "+id+" is not able to select the value "+value+" in the dropdown", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected the value "+value +" due to unexpected alert opened");
              reportStep("The element with id "+id+" is not selected the value "+value +" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected the value "+value+ " due to unknown error");
			reportStep("The element with id "+id+" is not selected the value "+value+ " due to unknown error", "fail");
		}
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement indexdrop =   driver.findElementById(id);
			Select inddrop = new Select(indexdrop);
			inddrop.selectByIndex(value);
			//System.out.println("The element with id " +id+ " is selected the value by using the index "+value);
			reportStep("The element with id " +id+ " is selected the value by using the index "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not able to select the value "+value+" form the dropdown");
			reportStep("The element with id "+id+" is not able to select the value "+value+" form the dropdown", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the applicaiton");
			reportStep("The element with id "+id+" is not stable in the applicaiton", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not able to select the value "+value+" due to unexpected alert opened");
			reportStep("The element with id "+id+" is not able to select the value "+value+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not able to select the dropdown value "+value+" due to unknown error");
			reportStep("The element with id "+id+" is not able to select the dropdown value "+value+" due to unknown error", "fail");
		}
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allhandles =  driver.getWindowHandles();
			for(String parentwin : allhandles) {
				driver.switchTo().window(parentwin);
				break;
			}
			//System.out.println("The browser focus is switched to parent window successfully");
			reportStep("The browser focus is switched to parent window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("This error occured due to  parent window is not found");
			reportStep("This error occured due to  parent window is not found", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser focus is not switched to parent window due to unknown error");
			reportStep("The browser focus is not switched to parent window due to unknown error", "fail");
		}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> lastwin= driver.getWindowHandles();
			for(String currwin : lastwin) {
				driver.switchTo().window(currwin);
			}
			//System.out.println("The browser focus is switched to last window successfully");
			reportStep("The browser focus is switched to last window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
            //System.err.println("This error occured due to last window is not found");
			reportStep("This error occured due to last window is not found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser focus is not moved to last window due to unknown error");
			reportStep("The browser focus is not moved to last window due to unknown error", "fail");
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted successfully");
			reportStep  ("The alert is accepted successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not accepted due to there is no alert found");
			reportStep("The alert is not accepted due to there is no alert found", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not accepted due to unknown error");
			reportStep("The alert is not accepted due to unknown error", "fail");
		}
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is dismissed successfully.");
			reportStep("The alert is dismissed successfully.", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not dismissed due to alert is not found");
			reportStep("The alert is not dismissed due to alert is not found", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not dismissed due to unknown error");
			reportStep("The alert is not dismissed due to unknown error", "fail");
		}
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext = null;
		try {
	      alerttext = driver.switchTo().alert().getText();
			//System.out.println("The alert is holding the following the text "+alerttext);
	      reportStep("The alert is holding the following the text "+alerttext,"pass",false);
		}catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert text "+alerttext+" is not retrived due to no alert present exception");
			reportStep("The alert text "+alerttext+" is not retrived due to no alert present exception", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert text is not retrived due to some unknown error");
			reportStep("The alert text is not retrived due to some unknown error", "fail",false);
		}
		return alerttext; 
	}

	@Override
	public long takeSnap()  {
		// TODO Auto-generated method stub
	
		long number =0;
		
			try {
				
			number = (long) (Math.floor(Math.random()*100000000)+100000);
				
				File temp= driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./reports/screenshots/"+number+".png");
				    FileUtils.copyFile(temp, dest);
				   // System.out.println("The screenshot is captured successsfully");
				  //  reportStep("The screenshot is captured successsfully", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
			//System.err.println("The screenshot is not captured due to unknown error");
			//reportStep("The screenshot is not captured due to unknown error", "fail");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//System.err.println("The screenshot is not captured due to I/O failed operation error");
				//reportStep("The screenshot is not captured due to I/O failed operation error", "fail");
			}
			return number ;
		}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The current browser is closed successfully ");
			reportStep("The current browser is closed successfully ", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The current browser is not closed due to unknown error");
			reportStep("The current browser is not closed due to unknown error", "fail", false);
		}
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All opened browsers for the current session is closed successfully");
			reportStep("All opened browsers for the current session is closed successfully", "pass", false);
		}  //not getting possible exceptions for quit and close
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The opened browsers for current sesion is not closed due to unknown error");
			reportStep("The opened browsers for current sesion is not closed due to unknown error", "fail", false);
		}
	}

	@Override
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("The thread is set to wait for "+ time +" seconds");
			reportStep("The thread is set to wait for "+ time +" seconds", "pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("Thread is still holding or sleeping");
			reportStep("Thread is still holding or sleeping", "fail");
		}catch (Throwable e) {
			// TODO: handle exception
			//System.err.println("The thread is not executed due to unexpected error");
			reportStep("The thread is not executed due to unexpected error", "fail");
		}
	}

	@Override
	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropbyxpath = driver.findElementByXPath(xpath);
			Select ind = new Select(dropbyxpath);
			ind.selectByIndex(value);
			//System.out.println("The  element with xpath "+xpath+ " is selected the value "+value+" successfully");
			reportStep("The  element with xpath "+xpath+ " is selected the value "+value+" successfully", "pass");
		}catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The  element with xpath "+xpath+ " is not able to select the value "+value+" in the dropdown");
			reportStep("The  element with xpath "+xpath+ " is not able to select the value "+value+" in the dropdown", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is noto selected the value "+value+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is noto selected the value "+value+" due to unexpected alert opened", "fail");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not selected the value "+value+ " due to unknown error");
			reportStep("The element with xpath "+xpath+" is not selected the value "+value+ " due to unknown error", "fail");
		}
	}

	@Override
	public void selectVisibleTextByXpath(String xpath, String visibletext) {
		// TODO Auto-generated method stub
		try {
			WebElement dropbyxpathwithvisibletext = driver.findElementByXPath(xpath);
			Select visibletxt = new Select(dropbyxpathwithvisibletext);
			visibletxt.selectByVisibleText(visibletext);
			//System.out.println("The  element with xpath "+xpath+ " is selected the value "+visibletext+" successfully");
			reportStep("The  element with xpath "+xpath+ " is selected the value "+visibletext+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+ xpath+" is not found in the DOM");
			reportStep("The element with xpath "+ xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with xpath "+xpath+" is not able to select the value "+visibletext+" in the dropdown");
			reportStep("The element with xpath "+xpath+" is not able to select the value "+visibletext+" in the dropdown", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The  element with xpath "+xpath+" is not stable in the applicaiton");
			reportStep("The  element with xpath "+xpath+" is not stable in the applicaiton", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selected the value "+visibletext+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not selected the value "+visibletext+" due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The visible text "+visibletext+" is not selected by using xpath "+xpath+" due to unknown error");
			reportStep("The visible text "+visibletext+" is not selected by using xpath "+xpath+" due to unknown error", "fail");
		}
	}

	@Override
	public void compareTwoStrings(String text1, String text2) {
		// TODO Auto-generated method stub
		try {
			if(text1.equals(text2)) {
				//System.out.println("Both text1"+ text1+ " and text2 "+text2+" is a successful match");
				reportStep("Both text1"+ text1+ " and text2 "+text2+" is a successful match", "pass");
			}else {
				//System.err.println("Both text1"+ text1+ " and text2 "+text2+" is not a perfect match");
				reportStep("Both text1"+ text1+ " and text2 "+text2+" is not a perfect match", "pass");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Text1"+ text1+ " and text2 "+text2+" is not compared due to unknown error");
			reportStep("Text1"+ text1+ " and text2 "+text2+" is not compared due to unknown error", "fail");
		}
	}

	@Override
	public void switchToFrameByIdOrName(String nameOrId) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(nameOrId);
			//System.out.println("The browser focus is shifted to frame by using this name or id "+nameOrId);
			reportStep("The browser focus is shifted to frame by using this name or id "+nameOrId, "pass");
		}catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("The frame with name or id "+nameOrId+" is not found in the dom");
			reportStep("The frame with name or id "+nameOrId+" is not found in the dom", "fail");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser focus is not shifted to frame by using this name or id "+nameOrId+" due to unknown error");
			reportStep("The browser focus is not shifted to frame by using this name or id "+nameOrId+" due to unknown error", "fail");
		}
	}

	@Override
	public void switchToFrameByIndex(int value) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(value);
			//System.out.println("The browser focus is shifted to the frame by using index "+value);
			reportStep("The browser focus is shifted to the frame by using index "+value, "pass");
		} catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("The frame with index "+value+" is not found in the DOM");
			reportStep("The frame with index "+value+" is not found in the DOM", "fail");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser focus is not shifted to frame by using index "+value+" due to unknown error");
			reportStep("The browser focus is not shifted to frame by using index "+value+" due to unknown error", "fail");
		}
	}

	@Override
	public void switchToFrameByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			WebElement frameelement = driver.findElementByXPath(xpath);
			driver.switchTo().frame(frameelement);
			//System.out.println("The browser focus is shifted to the frame by using xpath "+xpath);
			reportStep("The browser focus is shifted to the frame by using xpath "+xpath, "pass");
		}catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("The frame with xpath "+xpath+" is not found in the dom");
			reportStep("The frame with xpath "+xpath+" is not found in the dom", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The  element with xpath "+xpath+" is not found due to unexpected alert opened");
			reportStep("The  element with xpath "+xpath+" is not found due to unexpected alert opened", "fail");
		}  catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser focus is not shifted to the frame by using xpath "+xpath+ " due to unknown error");
			reportStep("The browser focus is not shifted to the frame by using xpath "+xpath+ " due to unknown error", "fail");
		}
	}

	@Override
	public void enterDataToAlert(String text) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(text);
			//System.out.println("The text "+text+" is entered into the alert input field successfully");
			reportStep("The text "+text+" is entered into the alert input field successfully", "pass",false);
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			//System.err.println("The text "+text+" is not entered data due to no alert found");
			reportStep("The text "+text+" is not entered data due to no alert found", "fail",false);
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text "+text+" is not enterd in the alert input field due to unknown error");	
			reportStep("The text "+text+" is not enterd in the alert input field due to unknown error", "fail",false);
			
		}
	}

	@Override
	public void refreshPage() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			//System.out.println("The Page is refreshed successfully");
			reportStep("The Page is refreshed successfully", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page is not refreshed due to unknown error");
			reportStep("The page is not refreshed due to unknown error", "fail");
		}
		
	}

	@Override
	public void switchToDefaultContent() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			//System.out.println("The browser focus is shifted  from frame to default content");
			reportStep("The browser focus is shifted  from frame to default content", "pass");
		    }catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser focus is not shifted to default content due to unknown error");
		    reportStep("The browser focus is not shifted to default content due to unknown error", "fail");
		}
	}
//need to create selectVisibleTextByName method


@Override
public void pageDown(String xpath) {
	// TODO Auto-generated method stub
	try {
		driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_DOWN);
		//System.out.println("The element with xpath "+xpath+" is entered the data "+data+" successfully");
		reportStep("The Page is scrolled with xpath "+xpath+" successfully", "pass");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
		reportStep("The page not scrolled  with xpath "+xpath+" is not found in DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
		reportStep("The The page not scrolled  with xpath "+xpath+" is not visible in the application", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpathValue+ " is not intractable in application");
		reportStep("The The page not scrolled  with xpath "+xpath+ " is not intractable in application", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpathValue+ " is not stable in the application");
		reportStep("The page not scrolled  with xpath "+xpath+ " is not stable in the application", "fail");
	}catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+ " is not scrolled page due to unexpected alert opened");\
		reportStep("The page not scrolled  with xpath "+xpath+ " due to unexpected alert opened", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not scrolled page due to unknown error");
		reportStep("The page not scrolled  with xpath "+xpath+" due to unknown error", "fail");
	}
	
}

@Override
public void enterByIdWithTab(String id , String data) {
	// TODO Auto-generated method stub
	try {
		driver.findElementById(id).sendKeys(data , Keys.TAB);
		//System.out.println("The element with id "+id+ " is entered the data "+data+ " successfully");
		reportStep("The element with id "+id+ " is entered the data "+data+ " successfully", "pass");
	}catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with id "+id+" is not found in the DOM");
		reportStep("The element with id "+id+" is not found in the DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not visible in application");
		reportStep("The element with id "+id+" is not visible in application", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not interactable in the application");
		reportStep("The element with id "+id+" is not interactable in the application", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+ " is not stable in the application");
		reportStep("The element with id "+id+ " is not stable in the application", "fail");
	}catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not entered "+data+" due to unexected alert opened");
		reportStep("The element with id "+id+" is not entered "+data+" due to unexected alert opened", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with id "+id+" is not entered "+data+ " due to unknown error");
		reportStep("The element with id "+id+" is not entered "+data+ " due to unknown error", "fail");
	}
}

@Override
public void enterByXpathWithTabKey(String xpath, String data) {
	// TODO Auto-generated method stub
				try {
				driver.findElementByXPath(xpath).sendKeys(data , Keys.TAB);
				//System.out.println("The element with xpath "+xpath+" is entered the data "+data+" successfully");
				reportStep("The element with xpath "+xpath+" is entered the data "+data+" successfully", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
				reportStep("The element with xpath "+xpath+" is not found in DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
				reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpathValue+ " is not intractable in application");
				reportStep("The element with xpath "+xpath+ " is not intractable in application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpathValue+ " is not stable in the application");
				reportStep("The element with xpath "+xpath+ " is not stable in the application", "fail");
			}catch (UnhandledAlertException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+ " is not scrolled page due to unexpected alert opened");
				reportStep("The element with xpath "+xpath+ " is not entered data "+data+" due to unexpected alert opened", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not scrolled page due to unknown error");
				reportStep("The element with xpath "+xpath+" is not entered data "+data+" due to unknown error", "fail");
			}
}

@Override
public void mouseHoverByXpath(String xpath) {
	// TODO Auto-generated method stub
	try {
		Actions builder = new Actions(driver);
		WebElement element = driver.findElementByXPath(xpath);
		builder.moveToElement(element).perform();
		//System.out.println("The mouse is hovered on the element with xpath " +xpath+" successfully");
		reportStep("The mouse is hovered on the element with xpath " +xpath+" successfully", "pass");
	} catch (ElementNotVisibleException e) {
		// TODO Auto-generated catch block
		//System.err.println("The mouse is not hovered on the element with xpath "+xpath+" due to element not visible in DOM");
		reportStep("The mouse is not hovered on the element with xpath "+xpath+" due to element not visible in DOM", "fail");
	}catch (NoSuchElementException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" not found in DOM");
		reportStep("The element with xpath "+xpath+" not found in DOM", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not stable in the application");
		reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not interactable in applicaiton");
		reportStep("The element with xpath "+xpath+" is not interactable in applicaiton", "fail");
	}catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not found due to unexpected alert opened");
		reportStep("The element with xpath "+xpath+" is not found due to unexpected alert opened", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" not found  due to unknown error");
		reportStep("The element with xpath "+xpath+" not found  due to unknown error", "fail");
	}
	
}


}
