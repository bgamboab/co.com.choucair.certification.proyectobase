package co.com.choucair.certificacion.proyectobase.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/traslate/traductor_google_datadriven.feature",
        tags = "@traducir",
        glue = "co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}