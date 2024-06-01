package com.quipux.digital.stepsDefinitions;

import com.quipux.digital.interactions.EsperaImplicita;
import com.quipux.digital.questions.ConfirmarCreacionCuenta;
import com.quipux.digital.tasks.CrearCuenta;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearCuentaStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario acceda a la pagina web {string}")
    public void queElUsuarioAccedaALaPaginaWeb(String url) {
        theActorCalled("Usuario").wasAbleTo(Open.url(url));

    }

    @Cuando("el usuario diligencie el formulario completo de registro con los datos")
    public void elUsuarioDiligencieElFormularioCompletoDeRegistroConLosDatos(DataTable datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearCuenta.conDatos(datos));
    }

    @Entonces("el usuario visualizara el mensaje de confirmacion")
    public void elUsuarioVisualizaraElMensajeDeConfirmacion() {
        OnStage.theActorInTheSpotlight().asksFor(ConfirmarCreacionCuenta.ir());

    }

}
