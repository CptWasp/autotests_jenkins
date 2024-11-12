package mavenTest.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"mavenTest"},
        tags = "@actions",
        plugin = {"pretty", "html:target/login-report.html"}
)
public class SiteActionTest {
}
