package core;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class BaseTest {
    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp(){
        //Evento de clique no botão Começar
        DriverFactory.getDriver().findElement(By.xpath("//android.widget.Button[@text='COMEÇAR']")).click();

    }

    //@AfterClass
    public static void finalizaClasse(){
        DriverFactory.killDriver();
    }

    @After
    public void tearDown() {
        takeScreenShot(testName);
        DriverFactory.killDriver();
    }

    public void generateScreenShot() {
        try {
            File image = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(image, new File("target/screenshots/"+testName.getMethodName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenShot(TestName testName) {
        Allure.addAttachment(testName.getMethodName(), new ByteArrayInputStream(((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES) ));
    }

    public void waitForTime(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
