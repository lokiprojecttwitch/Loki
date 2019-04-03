package loki;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Principal {
	
	public static void main(String[] args) {
		
		Variaveis v1 = new Variaveis();
		
		String nomeUsuraio = v1.getNomeUsuario();
		String senhaUsuario =  v1.getSenhaUsuario();
		String url = v1.getUrl();
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Loki\\chromedriver.exe");
		
		
		driver.get(url);
		driver.findElement(By.cssSelector(".tw-button--hollow > .tw-button__text")).click();	
		WebElement waitLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".tw-relative:nth-child(2) > .tw-pd-l-1")));
		driver.findElement(By.cssSelector(".tw-relative:nth-child(2) > .tw-pd-l-1")).sendKeys(nomeUsuraio);
		driver.findElement(By.cssSelector(".tw-relative:nth-child(1) > .tw-border-bottom-left-radius-medium")).sendKeys(senhaUsuario);
		driver.findElement(By.cssSelector(".tw-mg-t-2 > .tw-button")).click();
		//WebElement waitmature = wait.until(ExpectedConditions.elementToBeClickable(By.id("mature-link")));
		//driver.findElement(By.id("mature-link")).click();
		WebElement waitBau = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon > .vsc-initialized")));
		driver.findElement(By.cssSelector(".icon > .vsc-initialized")).click();
		
		

}
	
}
