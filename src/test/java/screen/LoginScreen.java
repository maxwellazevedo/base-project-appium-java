package screen;

import core.BaseScreen;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class LoginScreen extends BaseScreen {

    public void signIn(String email, String password) {
        //getDriver().findElementById("io.qaninja.android.twp:id/etEmail").sendKeys(email);
        getDriver().findElement(By.id("io.qaninja.android.twp:id/etEmail")).sendKeys(email);
        getDriver().findElement(By.id("io.qaninja.android.twp:id/etPassword")).sendKeys(password);
        //getDriver().findElement(By.id("io.qaninja.android.twp:id/btnSubmit")).click();
        clickAny(By.id("io.qaninja.android.twp:id/btnSubmit"));
    }

    public String toast() {
        //return getDriver().findElement(By.xpath("//android.widget.Toast"));
        return getDriver().findElement(By.xpath("//android.widget.Toast")).getText();
    }
}
