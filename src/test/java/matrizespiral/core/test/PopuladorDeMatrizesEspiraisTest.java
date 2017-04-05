package matrizespiral.core.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import matrizespiral.core.PopuladorDeMatrizesEspirais;

public class PopuladorDeMatrizesEspiraisTest {

	private PopuladorDeMatrizesEspirais populador;

	@Before
	public void instanciarPopuladorDeMatrizesEspirais() {
		populador = new PopuladorDeMatrizesEspirais();
	}

	@Test
	public void devePopular1x1() {
		Integer[][] matriz = new Integer[1][1];
		populador.popular(matriz);
		assertArrayEquals(new Integer[][] { { 1 } }, matriz);
	}

	@Test
	public void devePopular4x5() {
		Integer[][] matriz = new Integer[4][5];
		populador.popular(matriz);
		assertArrayEquals(new Integer[][] { { 1, 2, 3, 4, 5 }, { 14, 15, 16, 17, 6 }, { 13, 20, 19, 18, 7 },
				{ 12, 11, 10, 9, 8 } }, matriz);
	}

	@Test
	public void devePopular6x3() {
		Integer[][] matriz = new Integer[6][3];
		populador.popular(matriz);
		assertArrayEquals(new Integer[][] { { 1, 2, 3 }, { 14, 15, 4 }, { 13, 16, 5 }, { 12, 17, 6 }, { 11, 18, 7 },
				{ 10, 9, 8 } }, matriz);
	}

}
