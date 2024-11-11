package mavenTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "mavenTest.steps",
        tags = "@all",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}
