package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationView {

    public static Target ResFooter = Target.the("ResFooter").located(By.xpath("(//android.widget.ImageView[@resource-id=\"com.kinto_us.kepler:id/navigation_bar_item_icon_view\"])[2]"));
    public static Target AllowPer = Target.the("AllowPer").located(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button"));
    public static Target PickUpTime = Target.the("PickUpTime").located(By.xpath("//android.widget.ScrollView/android.view.View[2]"));
    public static Target PickOffTime = Target.the("PickOffTime").located(By.xpath("//android.widget.ScrollView/android.view.View[3]"));
    public static Target DateSelected = Target.the("DateSelected").located(AppiumBy.accessibilityId("Monday, November 11"));
    public static Target OkCalendar = Target.the("OkCalendar").located(By.xpath("//android.widget.Button[@resource-id=\"com.kinto_us.kepler:id/confirm_button\"]"));
    public static Target CheckButton = Target.the("CheckButton").located(By.xpath("//android.widget.ScrollView/android.view.View[5]/android.widget.Button"));

}
