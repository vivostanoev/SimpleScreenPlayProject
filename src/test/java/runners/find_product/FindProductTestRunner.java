package runners.find_product;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/features/find_product.feature",
        glue = {"steps"})
public class FindProductTestRunner {
}
