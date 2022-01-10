package CyberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RegisterScene {

    private WebDriver driver;
    private RegisterPageObject page;
    private DSL dsl;

    public void Register() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Register.html");
        page = new RegisterPageObject(driver);
        dsl = new DSL(driver);
    }

    public void setRegister() {
        page.setName("Pedro");
        page.setLastName("Vitorino");
        page.setAdress("Rua Joaquin, 786");
        page.setEmailAdress("pedrinhofofo@gmail.com");
        page.setPhone("34343434");
        page.setMale();
        page.setHobbiesCricket();

        page.interactLanguages("");
        page.setLanguages("English");
        page.HideLanguages("");

        page.setSkills("Java");
        page.setCountry("South Africa");
        page.setYear("1999");
        page.setMonth("December");
        page.setDay("3");
        page.setPassword("123456");
        page.setConfirmPassword("123456");
    }
}
