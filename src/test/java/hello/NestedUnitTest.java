package hello;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("A Capmaign")
@Tag("deve")
@Tag("slow")
public class NestedUnitTest {

	@BeforeAll
	public static void init(){
	    System.out.println("BeforeAll init() method called");
	}
	
	@BeforeEach
	void initEach() {
		System.out.println("Preparing Launch seq class level");
	}

	@Nested
	@DisplayName("is not empty")
	class IsEmpty {
		@Test
		@DisplayName("when no segment is added")
		public void emptyBookShelfWhenNoBookAdded() {
			// Test case removed for brevity
		}
	}

	@Nested
	@DisplayName("is for USA Segment")
	class isUSA {
		@Test
		@DisplayName("when any one customer belong to USA country")
		public void emptyBookShelfWhenNoBookAdded() {
			// Test case removed for brevity
		}

		@Test
		@DisplayName("when any one IP address start with 124")
		public void startsWithIP() {
			// Test case removed for brevity
		}
	}

}
