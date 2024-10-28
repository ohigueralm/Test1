package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordView {
    public static Target password = Target.the("password").located(By.xpath("//android.widget.EditText[@resource-id=\"com.kinto_us.kepler:id/password\"]"));
    public static Target LogInCTA = Target.the("LogInCTA").located(By.xpath("//android.widget.Button[@resource-id=\"com.kinto_us.kepler:id/login_button\"]"));

}
