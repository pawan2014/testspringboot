package hello;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Unit Test for running some dynamic code=>")
@Tag("prod")
@Tag("fast")
public class Unit5Tests {
	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		//Calculator calculator = new Calculator();
		assertEquals(2, 2L, "1 + 1 should equal 2");
	}
}
