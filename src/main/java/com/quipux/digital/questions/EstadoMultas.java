package com.quipux.digital.questions;

import com.quipux.digital.userinterfaces.ConsultarMultasUI;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EstadoMultas {

    public static Question<String> validar() {
        return actor -> TextContent.of(ConsultarMultasUI.TITULO_ESTADO_MULTAS).answeredBy(actor).toString().trim();
    }
}
