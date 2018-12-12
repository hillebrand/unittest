import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AdderTest {

	private Adder adder = new Adder();

	@Test
	public void shouldReturn5For2Plus3() {
		assertThat(adder.add(2, 3), is(5));
	}

	@Test
	public void shouldReturn7For3Plus4() {
		assertThat(adder.add(3, 4), is(7));
	}
}