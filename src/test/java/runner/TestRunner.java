package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/1_LoginAndroid.feature",
                "src/test/resources/features/2_MisionandVision.feature",
                "src/test/resources/features/3_Values.feature",
                "src/test/resources/features/4_FunctionsAndNoFunctions.feature",
                "src/test/resources/features/5_SalinasGroup.feature",
                "src/test/resources/features/6_Tareas.feature",
        },
        glue = "steps",
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"})

public class TestRunner {
}