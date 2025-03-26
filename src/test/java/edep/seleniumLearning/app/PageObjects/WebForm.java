package edep.seleniumLearning.app.PageObjects;

import org.openqa.selenium.By;

public class WebForm extends BasePage{

    By textInput = By.id("my-text-id");
    By passwordInput = By.name("my-password");
    By textArea = By.name("my-textarea");

    public WebForm(String browser, int timeoutSec) {
        this(browser);
        setTimeoutSec(timeoutSec);
    }

    public WebForm(String browser) {
        super(browser);
        visit("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
    }

    public void typeTextInput(String text) {
        type(textInput, text);
    }

    public void typePassword(String password) {
        type(passwordInput, password);
    }
    
    public void typeTextArea(String text) {
        type(textArea, text);
    }

    public String getTextInputValue() {
        return getValue(textInput);
    }
}
