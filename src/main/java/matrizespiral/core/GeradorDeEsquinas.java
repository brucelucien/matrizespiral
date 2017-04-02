package matrizespiral.core;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeEsquinas {

	public Integer calcularProximaEsquina(Integer esquinaAnterior, Integer qtdLinhaOuQtdColuna, Integer contador) {
		return esquinaAnterior + (qtdLinhaOuQtdColuna - contador);
	}

	public Integer[] calcularEsquinas(Integer qtdLinhas, Integer qtdColunas) {
		List<Integer> esquinas = new ArrayList<Integer>();
		esquinas.add(calcularProximaEsquina(0, qtdColunas, 0));
		Integer ultimaEsquina = qtdLinhas * qtdColunas;
		Boolean calculandoLinha = false;
		Integer qtdCiclos = 0;
		Integer ultimoIndice;
		Integer esquinaGerada = 1;
		while (esquinaGerada < ultimaEsquina) {
			calculandoLinha = !calculandoLinha;
			ultimoIndice = esquinas.size() - 1;
			if (calculandoLinha) {
				qtdCiclos++;
				esquinaGerada = calcularProximaEsquina(esquinas.get(ultimoIndice), qtdLinhas, qtdCiclos);
			} else {
				esquinaGerada = calcularProximaEsquina(esquinas.get(ultimoIndice), qtdColunas, qtdCiclos);
			}
			esquinas.add(esquinaGerada);
		}
		return converterIntegerListParaArray(esquinas);
	}

	private Integer[] converterIntegerListParaArray(List<Integer> esquinas) {
		Integer[] esquinasComoArray = new Integer[esquinas.size()];
		return esquinas.toArray(esquinasComoArray);
	}

}
