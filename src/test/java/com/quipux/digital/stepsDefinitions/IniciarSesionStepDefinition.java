package com.quipux.digital.stepsDefinitions;

import com.quipux.digital.questions.ConfirmarCreacionCuenta;
import com.quipux.digital.tasks.CrearCuenta;
import com.quipux.digital.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class IniciarSesionStepDefinition {


    @Cuando("el usuario diligencie el formulario de inicio de sesion con los datos {string} {string}")
    public void elUsuarioDiligencieElFormularioDeInicioDeSesionConLosDatos(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.conDatos(usuario,contrasena));
    }
    @Entonces("el usuario visualizara el home del portal")
    public void elUsuarioVisualizaraElHomeDelPortal() {
        OnStage.theActorInTheSpotlight().asksFor(ConfirmarCreacionCuenta.ir());
    }
}
