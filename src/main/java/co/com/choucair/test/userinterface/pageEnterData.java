package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pageEnterData {
    public static final Target Name = Target.the("Name user").locatedBy("//input[@name=\"firstName\"]");
    public static final Target MiddleName = Target.the("MiddleName").locatedBy("//input[@name=\"middleName\"]");
    public static final Target LastName = Target.the("LastName").locatedBy("//input[@name=\"lastName\"]");
    public static final Target Id = Target.the("Id user").locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    public static final Target Details = Target.the("Detail Option").locatedBy("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]");
    public static final Target UserName = Target.the("UserName").locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    public static final Target Password = Target.the("UserPassword").located(By.xpath("(//input[@type=\"password\"])[1])"));
    public static final Target ConfirmPassword = Target.the("ConfirmPassword").located(By.xpath("(//input[@type=\"password\"])[2])"));
    public static final Target SaveButton = Target.the("Save Button").locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
public static final Target Status = Target.the("Status button").located(By.xpath("(//span[@class=\"oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input\"])[1]"));
}
