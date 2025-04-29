package co.com.choucair.test.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pageOrange {
    public static final Target PIM = Target.the("Option PIM").located(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
}
