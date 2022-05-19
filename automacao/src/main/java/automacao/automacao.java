package automacao;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class automacao {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\chromedriver.exe");
		
		//Instanciando um objeto WebDriver				
		WebDriver driver = new ChromeDriver();

        //Abrindo o google no chrome
        driver.get("http://www.google.com");

        //Fazendo uma busca atraves do elemento name
        WebElement element = driver.findElement(By.name("q"));
        
        //definindo site o que será feito busca
        element.sendKeys("loja click Bike");
        
        //enviando comando de busca  
        element.submit();
        
        //acessando site da busca
        driver.get("https://lojaclickbike.com.br/");
        
        
       
    }
}
