package seleniumpack;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteYoutube {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Cria o objeto e importa o chrome driver
		File file = new File("C:/Users/henrique.matos/Desktop/Automação SCDE/Teste automação/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://google.com.br");
		WebElement digitacaoGoogle = driver.findElement(By.name("q"));
		digitacaoGoogle.sendKeys("youtube");
		WebElement clicarGoogle = driver.findElement(By.name("btnI"));
		clicarGoogle.submit();
		WebElement clicarYoutube = driver.findElement(By.className("ellip"));
		clicarYoutube.click();
		WebElement escreverVideo = driver.findElement(By.id("search"));
		escreverVideo.sendKeys("Rick Astley Never Gonna Give You Up");
		WebElement botaoYoutube = driver.findElement(By.id("search-icon-legacy"));
		botaoYoutube.click();
		Thread.sleep(1000);
		WebElement escolherVideo = driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Video)"));
		escolherVideo.click();
		

		
		//WebElement usernameElement = driver.findElement(By.name("username"));
		//WebElement passwordElement = driver.findElement(By.name("password"));
		//WebElement formElement = driver.findElement(By.name("form"));
		
		//usernameElement.sendKeys("AAAAAAAAA");
		//passwordElement.sendKeys("aaaaaaaaaa");
		//driver.findElement(By.linkText("entrar")).click();
		//formElement.submit();

}
}
