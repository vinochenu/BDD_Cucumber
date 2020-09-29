package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles", 
glue= {"classpath:StepDefinition","Hooks"},
dryRun=false , /*-> it will verify the mapping between feature file & step definition (whether all the methods are available as per feature file-it will not execute (only it will check the methods)*/
//dryRun=false-> it wont verify the mapping as above(it will work as normal flow)
//strict=true/*-> it will execute & verify the mapping between feature file & step definition ( it will fail & throw pending exception if any methods are missing between this )*/
//strict=false-> it will execute but it will not fail & wont through pending exception. it will just show missing snippet  
monochrome=true, /*-> this will help to print the console in human understandable line*/
//monochrome=false -> this will not print the console in human understandable line instead some special characters as machine level
//format= {"html:Reports/htmlreport", "json:Reports/jasonreport.jason","junit:Reports/xmlreport.xml"} -> it is depreciated still we can use to generate report
//plugin= {"html:Reports/htmlreport", "json:Reports/jasonreport.jason","junit:Reports/xmlreport.xml"} /*->  this will help to generate report based on whet we input (html or json or xml */

tags= {"@TaggedHook"}
		)
public class RunnerClass {

}
