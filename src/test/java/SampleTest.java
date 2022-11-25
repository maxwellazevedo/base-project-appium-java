import core.BaseTest;
import core.DriverFactory;
import io.appium.java_client.MobileElement;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class SampleTest extends BaseTest {

    @Test
    public void sampleTest() throws InterruptedException {

        //DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) DriverFactory.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextSwitcher/android.widget.Button");
        el1.click();
        MobileElement el2 = (MobileElement) DriverFactory.getDriver().findElementByAccessibilityId("Open navigation drawer");
        el2.click();
        MobileElement el3 = (MobileElement) DriverFactory.getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        el3.click();

    }

}
