package screen;

import core.BaseScreen;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class NavigatorScreen extends BaseScreen {

    public void tapHamburger() {
        String hamburger = "//android.widget.ImageButton[@content-desc='Open navigation drawer']";
        //getDriver().findElement(By.xpath(hamburger)).click();
        clickAny(By.xpath(hamburger));

    }

    public String list() {
        return getDriver().findElement(By.id("io.qaninja.android.twp:id/rvNavigation")).getText();
    }

    public void tapByText(String target) {
        clickByText(target);
        //getDriver().findElement(By.xpath("//*[@text='"+target+"']")).click();
    }

}
