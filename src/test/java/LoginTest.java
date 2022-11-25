import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import screen.LoginScreen;
import screen.NavigatorScreen;

public class LoginTest extends BaseTest {

    LoginScreen login = new LoginScreen();
    NavigatorScreen nav = new NavigatorScreen();

    @Test
    public void LoginSuccessTest() {

        nav.tapHamburger();
        nav.tapByText("FORMS");
        nav.tapByText("LOGIN");

        login.signIn("eu@papito.io", "qaninja");
        Assert.assertEquals("Show! Suas credenciais são validas.", login.toast());
    }

    @Test
    public void LoginFailureTest() {

        nav.tapHamburger();
        nav.tapByText("FORMS");
        nav.tapByText("LOGIN");

        login.signIn("eu@max.com", "1231");
        Assert.assertEquals("Senha inválida!", login.toast());
    }
}
