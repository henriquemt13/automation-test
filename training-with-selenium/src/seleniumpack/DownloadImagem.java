package seleniumpack;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import okio.Options;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;




public class DownloadImagem {
	@Test
	public static void main(String[] args) throws InterruptedException, IOException, HeadlessException, AWTException
    { {
		// TODO Auto-generated method stub
		
		//Cria o objeto e importa o chrome driver
		File file = new File("C:/Users/henrique.matos/Desktop/Automação SCDE/Teste automação/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 	String fileDownloadPath = "C:/Users/henrique.matos/Desktop/";

//		 	ChromeOptions option = new ChromeOptions();

//		 	//configurações de donwload (links) [não usarei nesse caso]
//		   Map<String, Object> prefsMap = new HashMap<String, Object>();
//		   prefsMap.put("profile.default_content_settings.popups", 0);
//		   prefsMap.put("download.default_directory", fileDownloadPath);
//		   option.setExperimentalOption("prefs", prefsMap);
//		   DesiredCapabilities cap = DesiredCapabilities.chrome();
//		   // 
		   
		driver.manage().window().maximize();   
		driver.get("https://google.com.br");
		WebElement digitacaoGoogle = driver.findElement(By.name("q"));
		digitacaoGoogle.sendKeys("matrix energia");
		WebElement clicarGoogle = driver.findElement(By.name("btnI"));
		clicarGoogle.submit();
		WebElement clicarImagens = driver.findElement(By.linkText("Imagens"));
		clicarImagens.click();
		WebElement escolherImagem = driver.findElement(By.id("fx_P_e6ndi8paM:"));
		escolherImagem.click();
		 Thread.sleep(1000);
		 
		 
		 	//Tirar Print da tela
	        
		 //BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));   
		 //ImageIO.write(image, "png", new File("C:/Users/henrique.matos/Desktop/CurrentScreenshot.png")); 
		 	
		 	//
		 
		 
		  
		
		 Actions action = new Actions(driver);
		// action.contextClick(escolherImagem).build().perform();
		 
		 Thread.sleep(1000);

		 //action.contextClick(escolherImagem).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		 action.contextClick(escolherImagem).perform();   
		 //WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[6]"));  
		 //elementOpen.click(); 
		 
		 
		//Use Actions api to click on Options
		 Actions builder = new Actions(driver);
		 builder.click(escolherImagem);
		 Action selectMultiple = builder.build();
		 selectMultiple.perform(); 

		 //Select 2nd Option
		 Robot robot = new Robot(); 
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);	
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(500);
		 robot.keyPress(KeyEvent.VK_UP);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_UP);
		 Thread.sleep(500);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(500);
		 robot.keyPress(KeyEvent.VK_RIGHT);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(500);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);	
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_RIGHT);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_RIGHT);
		 Thread.sleep(200);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(400);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		 // criando caminho para download de arquivo
		 String downloadFilepath = "C:/Users/henrique.matos/Desktop/Automação SCDE/imagens";
		 Map<String, Object> preferences = new Hashtable<String, Object>();
		 preferences.put("profile.default_content_settings.popups", 0);
		 preferences.put("download.prompt_for_download", "false");
		 preferences.put("download.default_directory", downloadFilepath);

		 // disable flash and the PDF viewer
		 preferences.put("plugins.plugins_disabled", new String[]{
		     "Adobe Flash Player", "Chrome PDF Viewer"});

		 ChromeOptions options = new ChromeOptions();
		 options.setExperimentalOption("prefs", preferences);

		 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 //driver = new ChromeDriver(capabilities);
		 //
		


}
    }}
