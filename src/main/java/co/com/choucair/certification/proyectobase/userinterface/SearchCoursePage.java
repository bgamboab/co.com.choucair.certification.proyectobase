package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Click button Universidad choucair")
            .located(By.xpath("//*[@id='universidad']/div[1]/a/h4/strong"));
    public static final Target INPUT_SEARCH = Target.the("search course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click button go course")
            .located(By.xpath("//*[@id='coursesearch']/fieldset/button"));
    public static  final Target CLICK_COURSE = Target.the("Click in course")
            .located(By.xpath("//a[contains(text(), 'Metodología Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Name course")
            .located(By.xpath("//a[contains(text(), 'Metodología Bancolombia')]"));
}
