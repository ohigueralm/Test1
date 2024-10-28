package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationDetailsView {
    public static Target ReadMore = Target.the("ReadMore").located(By.xpath("//android.widget.TextView[@text=\"Read more\"]"));
    public static Target TermsAgree = Target.the("TermsAgree").located(By.xpath("//android.widget.CheckBox"));
    public static Target ConfirmReservation = Target.the("ConfirmReservation").located(By.xpath(" //android.widget.TextView[@text=\"CONFIRM RESERVATION\"]"));

}
