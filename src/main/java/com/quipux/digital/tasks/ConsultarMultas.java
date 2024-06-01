package com.quipux.digital.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.quipux.digital.userinterfaces.ConsultarMultasUI.LBL_DOCUMENTO_MULTAS;
import static com.quipux.digital.userinterfaces.ConsultarMultasUI.TITULO_ESTADO_MULTAS;
import static com.quipux.digital.userinterfaces.CrearCuentaUI.SELECT_TIPO_DOC;
import static com.quipux.digital.userinterfaces.PaginaInicioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarMultas  implements Task {

    String documento;

    public ConsultarMultas (String documento){
        this.documento=documento;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(documento).into(LBL_DOCUMENTO_MULTAS).thenHit(Keys.TAB).thenHit(Keys.ENTER),
                WaitUntil.the(TITULO_ESTADO_MULTAS, isVisible()).forNoMoreThan(30).seconds()
        );

    }

    public static ConsultarMultas conDatos(String documento){
        return instrumented(ConsultarMultas.class, documento);
    }
}
