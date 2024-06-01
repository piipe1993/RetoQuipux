package com.quipux.digital.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.quipux.digital.userinterfaces.CrearCuentaUI.*;
import static com.quipux.digital.userinterfaces.PaginaInicioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IniciarSesion implements Task {

    String usuario,contrasena;

    public IniciarSesion (String usuario, String contrasena){
        this.usuario=usuario;
        this.contrasena=contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(LBL_USUARIO_INICIO),
                Enter.theValue(contrasena).into(LBL_CONTRASENA_INICIO),
                Click.on(BTN_INICIAR_SESION)

        );
    }

    public static IniciarSesion conDatos(String usuario, String contrasena){
        return instrumented(IniciarSesion.class, usuario,contrasena);
    }
}
