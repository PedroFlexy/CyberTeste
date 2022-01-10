package CyberTest;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject {
	
	private DSL dsl;
	public RegisterPageObject(WebDriver driver) {
	dsl = new DSL(driver);
}
	
	public void setName(String nome) {
		dsl.escrever("//*[@placeholder='First Name']", nome);
	}
	
	public void setLastName(String sobrenome) {
		dsl.escrever("//*[@placeholder='Last Name']", sobrenome);
	}
	
	public void setAdress(String adress) {
		dsl.escrever("//*[@ng-model='Adress']", adress);
	}
	
	public void setEmailAdress(String emailAdress) {
		dsl.escrever("//*[@ng-model='EmailAdress']", emailAdress);
	}
	
	public void setPhone(String Phone) {
		dsl.escrever("//*[@ng-model='Phone']", Phone);
	}
	
	public void setMale() {
		dsl.clicarBotao("//*[@value='Male']");
	}
	
	public void setFemale() {
		dsl.clicarBotao("//*[@value='FeMale']");
	}
	 
	public void setHobbiesCricket() {
		dsl.clicarBotao("//input[@id='checkbox1']");
	}
	
	public void setHobbiesMovies() {
		dsl.clicarBotao("//input[@id='checkbox2']");
	}
	
	public void setHobbiesHockey() {
		dsl.clicarBotao("//input[@id='checkbox3']");
	}
	
	public void interactLanguages(String valor) {
		dsl.clicarBotao("//div[@id='msdd']");
	}

	public void setLanguages(String valor) {
		dsl.clicarBotao("//li/a[ text()='English']");
	}
	
	public void HideLanguages(String valor) {
		dsl.clicarBotao("//label[contains(text(), 'Languages')]");
	}
	
	public void setSkills(String valor) {
		dsl.selectCombo("//select[@id='Skills']", valor);
	}
	
	public void setCountry(String valor){
		dsl.clicarBotao("//span[@role='presentation']");
		dsl.escrever("//input[@type='search']",valor);
		dsl.clicarBotao("//li[text()='"+valor+"']");
	}
	
	public void setYear(String valor) {
		dsl.selectCombo("//select[@id='yearbox']", valor);
	}
	
	public void setMonth(String valor) {
		dsl.selectCombo("//select[@placeholder='Month']", valor);
	}
	
	public void setDay(String valor) {
		dsl.selectCombo("//select[@id='daybox']", valor);
	}
	
	public void setPassword(String nome) {
		dsl.escrever("//input[@id='firstpassword']", nome);
	}
	
	public void setConfirmPassword(String nome) {
		dsl.escrever("//input[@id='secondpassword']", nome);
	}
	
}
	
