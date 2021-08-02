package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.GoogleTraslateData;
import co.com.choucair.certification.proyectobase.tasks.AbrirPagina;
import co.com.choucair.certification.proyectobase.tasks.Traducir;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class GoogleTraslateDefinitions {

    @Given("^que Brayant quiere usar el traductor de google$")
    public void que_Brayant_quiere_usar_el_traductor_de_google()  {
        OnStage.theActorCalled("brayant").wasAbleTo(AbrirPagina.translate());

    }

    @When("^el traduce una palabra de inglés a español$")
    public void el_traduce_una_palabra_de_inglés_a_español(List<GoogleTraslateData> GoogletraslateData){
        OnStage.theActorInTheSpotlight().attemptsTo(Traducir.InglesAEspanol(GoogletraslateData));

    }

    @Then("^el debería ver la palabra traducida del idioma origen a idioma destino$")
    public void el_debería_ver_la_palabra_traducida_del_idioma_origen_a_idioma_destino() {
    }
}
