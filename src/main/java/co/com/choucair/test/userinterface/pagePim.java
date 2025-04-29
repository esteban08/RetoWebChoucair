package co.com.choucair.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pagePim {
    public static final Target ADD = Target.the("Register user").located(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
public static final Target Name = Target.the("Employed Name").located(By.xpath("(//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"])[1]"));
public static final Target Search = Target.the("Button Search").located(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
public static final  Target Found = Target.the("User Found").located(By.xpath("(//span[@class=\"oxd-text oxd-text--span\"])[1]"));
}
