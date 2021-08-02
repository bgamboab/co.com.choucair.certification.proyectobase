package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TraducirTranslate extends PageObject {
    public static final Target ENTER_INPUT = Target.the("Dar click para buscar un idioma inglés")
            .located(By.cssSelector("//textarea[aria-label='Texto original']"));

}
