package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pageOrigin {
    public static final Target Name = Target.the("Name").located(By.xpath("//input[@name=\"username\"]"));
    public static final Target Password = Target.the("Pasword").located(By.xpath("//input[@name=\"password\"]"));
    public static final Target LoginButton = Target.the("Login").located(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
}
