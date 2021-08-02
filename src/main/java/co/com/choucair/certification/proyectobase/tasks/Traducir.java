package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.GoogleTraslateData;
import co.com.choucair.certification.proyectobase.userinterface.TraducirTranslate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Traducir implements Task {

    private GoogleTraslateData googletraslateData;

    public Traducir(List<GoogleTraslateData> googletraslateData) {
        this.googletraslateData = (GoogleTraslateData) googletraslateData;
    }



    public static Performable InglesAEspanol(List<GoogleTraslateData> googletraslateData) {
        return Tasks.instrumented(Traducir.class,googletraslateData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("prueba").into(TraducirTranslate.ENTER_INPUT)
        );

    }
}
