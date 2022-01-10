package CyberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DatePickerScene {

	private WebDriver driver;
	private DSL dsl;
  
	
	public DatePickerScene() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		dsl = new DSL(driver);
	}
	
	public void DatePickerDisable(String year, String month, String day ) {
		String dateYear =  "//span[@class='ui-datepicker-year']";
		String dateMonth = "//span[@class='ui-datepicker-month']";
		String dateDay = "//a[@class='ui-state-default' and contains(text(), '" + day + "')]";
		String prevButton = "//a[@data-handler='prev']";
		
		dsl.clicarBotao("//input[@id='datepicker1']");
		
		System.out.println(dsl.obterTexto(dateYear));
		
		while(!(dsl.obterTexto(dateYear).equals(year) && dsl.obterTexto(dateMonth).equals(month))) {
			dsl.clicarBotao(prevButton);
	}
		
		dsl.clicarBotao(dateDay);
		 
	}
	 
	public void DataPickerEnable() {
		dsl.clicarBotao("//input[@id='datepicker2']");
		dsl.escrever("//input[@id='datepicker2']", "12/03/1999");
	}
}
