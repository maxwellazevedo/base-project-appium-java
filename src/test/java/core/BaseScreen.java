package core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static core.DriverFactory.getDriver;

public class BaseScreen {

    public void write(By by, String texto) {
        getDriver().findElement(by).sendKeys(texto);
    }

    public String getText(By by) {
        return getDriver().findElement(by).getText();
    }

    public void clickAny(By by) {
        getDriver().findElement(by).click();
    }

    public void clickByText(String texto) {
        clickAny(By.xpath("//*[@text='" + texto + "']"));
    }

    public void selectCombo(By by, String value) {
        getDriver().findElement(by).click();
        clickByText(value);
    }

    public boolean isChecked(By by) {
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public boolean existsElementByText(String text) {
        List<MobileElement> elements = getDriver().findElements(By.xpath("//*[@text='" + text + "']"));
        return elements.size() > 0;
    }
}
