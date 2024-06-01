package com.quipux.digital.stepsDefinitions;

import com.quipux.digital.questions.EstadoMultas;
import com.quipux.digital.tasks.ConsultarMultas;
import com.quipux.digital.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ConsultarMultasStepDefinition {

    @Cuando("el usuario ingrese el documento a consultar {string}")
    public void elUsuarioIngreseElDocumentoAConsultar(String documento) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultarMultas.conDatos(documento));
    }
    @Entonces("el usuario visualizara el listado de multas")
    public void elUsuarioVisualizaraElListadoDeMultas() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The Displayed Total Balance:", EstadoMultas.validar(),equalTo("Estado"))
        );
    }
}
