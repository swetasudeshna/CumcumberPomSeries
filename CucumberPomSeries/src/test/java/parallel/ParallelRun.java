package parallel;

import org.testng.annotations.DataProvider;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		         plugin= {"pretty",
        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                  "timeline:test-output-thread/",
                 
		         "rerun:target/failedrerun.txt"},
		          //tags="not @Skip",
				  monochrome=true,
				  glue= {"parallel"},
				 features= {"src/test/resources/parallel"}
		        
		        
			)


public class ParallelRun extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
		
	}

}
