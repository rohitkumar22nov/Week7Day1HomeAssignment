package runnershome;

import io.cucumber.testng.CucumberOptions;
import stepDefs.SetupAndLogin;

@CucumberOptions(features = "src/test/java/featureshome",
glue = "stepDefshome",
monochrome = true,
publish = true		
		)

public class RunCucumberTests extends SetupAndLogin{

}
