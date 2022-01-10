package CyberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FrameScene {
 
	private WebDriver driver;
	private DSL dsl;
 
		public void setFrame() {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Frames.html");
			dsl = new DSL(driver);
		}
		
		public void Frame() {
			driver.switchTo().frame(0);
			dsl.escrever("//input[@type='text'] ", "pedro");
			driver.switchTo().defaultContent();
			dsl.clicarBotao("//a[starts-with(@href, '#Multiple')]");
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			driver.switchTo().frame(frame1);
			WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			driver.switchTo().frame(frame2);
			dsl.escrever("//input[@type='text']", "pedro2");
			driver.switchTo().defaultContent();
		}
		
		
}
		
		
			
		
		
		

