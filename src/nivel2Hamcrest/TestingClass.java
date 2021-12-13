package nivel2Hamcrest;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

class TestingClass {


	@Test
	public void fellowShipOfTheRingShouldContainer7() {
	    assertThat("Gandalf", length(is(7)));
	}
	public static  Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	          return actual.length();
	        }
	    };
	}


}
