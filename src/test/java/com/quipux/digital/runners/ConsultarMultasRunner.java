package com.quipux.digital.runners;

import com.quipux.digital.utils.BeforeSuite;
import com.quipux.digital.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@ConsultarMultas",
        glue = "com.quipux.digital.stepsDefinitions",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class ConsultarMultasRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features");
    }
}

