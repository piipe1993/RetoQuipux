package com.quipux.digital.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.quipux.digital.userinterfaces.CrearCuentaUI.*;
import static com.quipux.digital.userinterfaces.PaginaInicioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearCuenta implements Task {

    private final DataTable datos;
    public static List<WebElementFacade> listaTiposDoc=new ArrayList<>();

    public CrearCuenta(DataTable datos) {

        this.datos = datos;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Map<String, String>> rows = datos.asMaps(String.class, String.class);
        Map<String, String> data = rows.get(0);
        String tipoDoc = data.get("tipoDoc");
        String documento = data.get("documento");
        String nombres= data.get("nombres");
        String apellidos = data.get("apellidos");
        String celular = data.get("celular");
        String correo  = data.get("correo");
        String contraseña  = data.get("contraseña");

        actor.attemptsTo(
                Click.on(OPCION_REGISTRATE_INICIO),
                WaitUntil.the(SELECT_TIPO_DOC, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(SELECT_TIPO_DOC),
                Click.on(LISTA_TIPOS_DOCUMENTOS)

        );

 /*
        listaTiposDoc = LISTA_TIPOS_DOCUMENTOS.resolveAllFor(actor);
        int sizeTipos = listaTiposDoc.size();


    switch(tipoDoc) {
            case "CD":
                for (int j = 0; j < (sizeTipos); j++) {
                    String texttipo = listaTiposDoc.get(j).getText();
                    if (texttipo.contains("CD")) {
                        actor.attemptsTo(
                                Scroll.to(listaTiposDoc.get(j)).andAlignToBottom(),
                                Click.on(listaTiposDoc.get(j))
                        );
                    }

                }
                break;
            case "CC":
                for (int j = 0; j < (sizeTipos); j++) {
                    String texttipo = listaTiposDoc.get(j).getText();
                    if (texttipo.contains("CC")) {
                        actor.attemptsTo(
                                Scroll.to(listaTiposDoc.get(j)).andAlignToBottom(),
                                Click.on(listaTiposDoc.get(j))
                        );
                    }

                }
                break;
            case "CE":
                for (int j = 0; j < (sizeTipos); j++) {
                    String texttipo = listaTiposDoc.get(j).getText();
                    if (texttipo.contains("CE")) {
                        actor.attemptsTo(
                                Scroll.to(listaTiposDoc.get(j)).andAlignToBottom(),
                                Click.on(listaTiposDoc.get(j))
                        );
                    }

                }
                break;

        }

*/

        actor.attemptsTo(
             Enter.theValue(documento).into(LBL_NUMERO_DOC),
                Enter.theValue(nombres).into(LBL_NOMBRE),
                Enter.theValue(apellidos).into(LBL_APELLIDOS),
                Enter.theValue(celular).into(LBL_CELULAR),
                Enter.theValue(correo).into(LBL_EMAIL),
                Enter.theValue(correo).into(LBL_CONFIRMAR_EMAIL),
                Enter.theValue(contraseña).into(LBL_CONTRASENA),
                Enter.theValue(contraseña).into(LBL_CONFIRMAR_CONTRASENA),
                Click.on(OPCION_REGISTRARME)

        );
    }

    public static CrearCuenta conDatos(DataTable datos){
        return instrumented(CrearCuenta.class, datos);
    }
}
