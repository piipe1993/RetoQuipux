package com.quipux.digital.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultarMultasUI extends PageObject {

    public static final Target LBL_DOCUMENTO_MULTAS = Target.the("label DOCUMENTO Multas").located(By.id("busqueda"));
    public static final Target TITULO_ESTADO_MULTAS = Target.the("Titulo estado multas").locatedBy("//th[text()='Estado']");


}
