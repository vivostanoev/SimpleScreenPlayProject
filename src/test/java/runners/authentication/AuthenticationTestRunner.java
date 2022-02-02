package runners.authentication;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/features/authentication.feature",
        glue = {"steps"})
public class AuthenticationTestRunner {
}
