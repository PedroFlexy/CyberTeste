package CyberTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
	private WebDriver driver;
	
		public DSL(WebDriver driver) {
			this.driver = driver;
	}
		
		public void escrever(String id_campo, String texto) {
			driver.findElement(By.xpath(id_campo)).sendKeys(texto);
	} 
		
		public String obterValorCampo(String id_campo) {
			return driver.findElement(By.xpath(id_campo)).getAttribute("value");
	}
		
		public void clicar(String id) { 
			driver.findElement(By.xpath(id)).click();
	}
		
		public boolean isRadioMarcado(String string ) {
			return driver.findElement(By.xpath(string)).isSelected();
	}
		
		public void selectCombo(String xpath, String valor) {
			WebElement element = driver.findElement(By.xpath(xpath));
			Select combo = new Select(element);
			combo.selectByValue(valor);
	}
		
		public String obterValorCombo( String valor) {
			WebElement element = driver.findElement(By.xpath(valor));
			Select combo = new Select(element);
			return combo.getFirstSelectedOption().getText();
			
	}
		
		public void clicarBotao(String by) {
			driver.findElement(By.xpath(by)).click();
			
	}
		
		public String obterTexto(String by) {
			return driver.findElement(By.xpath(by)).getText();
	}
		
}

