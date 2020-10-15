package exercice.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestSurfaceCalculator {

	@Test
	public void shouldCalculateArea() {
		List<Double> r = new ArrayList<>();
		r.add(2.0);
		List<Double> surface = SurfaceCalculator.size(r);

		List<Double> expected = new ArrayList<>();
		expected.add(12.5663706);

		Assert.assertEquals(surface, expected);
	}
}
