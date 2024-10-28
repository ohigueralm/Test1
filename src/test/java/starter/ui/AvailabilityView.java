package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AvailabilityView {
    public static Target FirstVeh = Target.the("FirstVeh").located(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]"));

}
