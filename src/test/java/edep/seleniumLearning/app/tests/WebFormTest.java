package edep.seleniumLearning.app.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edep.seleniumLearning.app.PageObjects.WebForm;

public class WebFormTest {

    WebForm form;

    @DataProvider(name = "browser")
    public  static Object[][] data() {
        return new Object[][] {{"firefox"}, {"chrome"}};
    }

    // @BeforeMethod
    // public void setup() {
    //     form = new WebForm("firefox");
    // }

    @AfterMethod
    public void teardown() throws InterruptedException {
       // Thread.sleep(Duration.ofSeconds(3).toMillis());
        form.quit();
    }

    @Test(dataProvider = "browser")
    public void testTextInput(String browser) {
        form = new WebForm(browser);
        form.typeTextInput("Hello Selenium");
        assertThat(form.getTextInputValue()).isEqualTo("Hello Selenium");
    }
    
}
