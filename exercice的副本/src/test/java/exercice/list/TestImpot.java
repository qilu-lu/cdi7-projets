package exercice.list;

import org.junit.Assert;
import org.junit.Test;

import hab.Habitation;
import hab.HabitationProfessionnelle;

public class TestImpot {
	@Test
	public void should_calculate_impots_for_hab_individuelle() {
		Habitation monHabitation = null;
		
		monHabitation = new HabitationProfessionnelle("ImportExport", "METZ", 2500.0, 130);

		double I = monHabitation.impot();

		double expected = 135000.0;

		Assert.assertEquals(expected, I, 0.00001);
	}
}