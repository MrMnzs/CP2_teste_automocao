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

        // Opening Google
        driver.get("http://www.google.com");

        // q its the search box name/ID
        WebElement element = driver.findElement(By.name("q"));

        // Seaching for Juliano Marcos Martins - me
        element.sendKeys("FIAP");
        
        // Submit the form
        element.submit();

        // Printing the page title - just for example
        System.out.println("Page title is: " + driver.getTitle());

		// If you want to Close the browser, uncomment this line
		// driver.quit();
    }
}
