package runner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import junit5Test.TestAddMethod;


@RunWith(JUnitPlatform.class)
// Pass single package
// @SelectPackages("junit5Test")
// Pass multiple packages
 //@SelectPackages({"junit5Test","login"}) // not working
// run one class at a time
 // @SelectClasses(TestAddMethod.class)

// run class with package name

// @SelectClasses(login.TestAddMethod.class)

// class from different packages

//@SelectClasses({login.TestAddMethod.class,TestAddMethod.class})

// Tag example
@SelectClasses({junit5Test.TaggingTest.class})
@IncludeTags({"Sanitytest", "Smoketest"})


public class Junit5runner {

}
