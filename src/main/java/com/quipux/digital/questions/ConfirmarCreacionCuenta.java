package com.quipux.digital.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.quipux.digital.userinterfaces.CrearCuentaUI.MENSAJE_CONFIRMACION_REGISTRO;

public class ConfirmarCreacionCuenta implements Question<Boolean>{
public Boolean answeredBy(Actor actor) {
        return MENSAJE_CONFIRMACION_REGISTRO.resolveFor(actor).isVisible();
        }

public static Question<Boolean> ir (){
        return new ConfirmarCreacionCuenta();
        }


}
