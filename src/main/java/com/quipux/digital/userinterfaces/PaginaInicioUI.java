package com.quipux.digital.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioUI  extends PageObject {

    public static final Target OPCION_REGISTRATE_INICIO = Target.the("Opcion registrate").locatedBy("//u[text()='Regístrate']");
    public static final Target LBL_USUARIO_INICIO = Target.the("label usuario -inicio de sesion").located(By.id("usuario"));
    public static final Target LBL_CONTRASENA_INICIO = Target.the("label contraseña -inicio de sesion").located(By.id("contrasena"));
    public static final Target BTN_INICIAR_SESION = Target.the("Botón iniciar sesion").locatedBy("//button[text()[normalize-space()='Iniciar sesión']]");
}