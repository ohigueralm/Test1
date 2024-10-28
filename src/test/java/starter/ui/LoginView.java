package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {
    public static Target selectorenv = Target.the("selectorenv")
            .located(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]"));
    public static Target deltaselect = Target.the("deltaselect").located(By.xpath("//android.widget.TextView[@text=\"Delta\"]"));
    public static Target username = Target.the("username").located(By.xpath("//android.widget.EditText"));
    public static Target nextbuttom = Target.the("nextbuttom").located(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[3]/android.widget.Button"));
    public static Target password = Target.the("password").located(By.xpath("//android.widget.EditText[@resource-id=\"com.kinto_us.kepler:id/password\"]"));
    public static Target LogInCTA = Target.the("LogInCTA").located(By.xpath("//android.widget.Button[@resource-id=\"com.kinto_us.kepler:id/login_button\"]"));

}
