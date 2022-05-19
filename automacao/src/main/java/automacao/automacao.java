package automacao;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class automacao {
	public static void main(String[] args) {
		
		//definido navegador 
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\chromedriver.exe");
		
		//Instanciando um objeto WebDriver				
		WebDriver driver = new ChromeDriver();

		//Abrindo Google para buscar site
        driver.get("http://www.google.com");
        
        //localizando elemento de busca no google
        WebElement element = driver.findElement(By.name("q"));

    }
}
