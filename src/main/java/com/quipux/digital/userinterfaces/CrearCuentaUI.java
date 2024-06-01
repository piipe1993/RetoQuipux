package com.quipux.digital.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuentaUI extends PageObject {

    public static final Target SELECT_TIPO_DOC = Target.the("label usuario -inicio de sesion").located(By.className("select2-selection__placeholder"));
    public static final Target LISTA_TIPOS_DOCUMENTOS = Target.the("label usuario -inicio de sesion").located(By.className("select2-results__option"));
    public static final Target TIPO_CD = Target.the("Opcion tipo documento CD").located(By.id("select2-tipoDocumento-result-0s81-8"));
    public static final Target TIPO_CC = Target.the("Opcion tipo documento CC").located(By.id("select2-tipoDocumento-result-xq2u-2"));
    public static final Target TIPO_CE = Target.the("Opcion tipo documento CE").located(By.id("select2-tipoDocumento-result-ccyb-4"));
    public static final Target LBL_NUMERO_DOC = Target.the("label numero documento").located(By.id("numeroDocumento"));

    public static final Target LBL_NOMBRE = Target.the("label Nombre").located(By.id("nombre"));
    public static final Target LBL_APELLIDOS = Target.the("label apellidos").located(By.id("apellido"));
    public static final Target LBL_CELULAR = Target.the("label celular").located(By.id("phone"));
    public static final Target LBL_EMAIL = Target.the("label Email").located(By.id("emailRegistro"));
    public static final Target LBL_CONFIRMAR_EMAIL = Target.the("label confirmar Email").located(By.id("confirmEmailRegistro"));
    public static final Target LBL_CONTRASENA = Target.the("label contraseña").located(By.id("password"));
    public static final Target LBL_CONFIRMAR_CONTRASENA = Target.the("label confirmar contraseña").located(By.id("confirmPasswordRegistro"));
    public static final Target OPCION_REGISTRARME = Target.the("Opcion registrate").locatedBy("//button[text()='Registrarme']");
    public static final Target MENSAJE_CONFIRMACION_REGISTRO = Target.the("Mensaje confirmación cuenta").locatedBy("//a[@class='uk-close']/following-sibling::div[1]");


}


