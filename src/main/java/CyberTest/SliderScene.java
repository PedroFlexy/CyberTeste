package CyberTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SliderScene {
	
	private WebDriver driver;
	private DSL dsl;

	
	public SliderScene() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Slider.html");
		dsl = new DSL(driver);
	}
	@Test
	public void Slider() {
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/a"));
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(slider, 340, 0).build();
		action.perform();
		  
	}
}
