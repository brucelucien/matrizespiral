package matrizespiral.core;

public class PopuladorDeMatrizesEspirais {

	private GeradorDeEsquinas geradorDeEsquinas;

	{
		geradorDeEsquinas = new GeradorDeEsquinas();
	}

	public void popular(Integer[][] matriz) {
		final Integer PRIMEIRA_LINHA = 0;
		Integer[] esquinas = geradorDeEsquinas.calcularEsquinas(matriz.length, matriz[PRIMEIRA_LINHA].length);
		Integer ultimoNumeroDaSequencia = esquinas[esquinas.length - 1];
		DirecaoPopulador direcaoAtual = DirecaoPopulador.DIREITA;
		Integer linha = 0;
		Integer coluna = 0;
		Integer atual = 1;
		matriz[linha][coluna] = atual++;
		for (; atual <= ultimoNumeroDaSequencia; atual++) {
			switch (direcaoAtual) {
			case DIREITA:
				coluna++;
				break;
			case ABAIXO:
				linha++;
				break;
			case ESQUERDA:
				coluna--;
				break;
			case ACIMA:
				linha--;
				break;
			}
			matriz[linha][coluna] = atual;
			if (atualAtuaComoEsquina(atual, esquinas)) {
				direcaoAtual = mudarDeDirecao(direcaoAtual);
			}
		}
	}

	private DirecaoPopulador mudarDeDirecao(DirecaoPopulador direcaoAtual) {
		DirecaoPopulador proximaDirecao = null;
		switch (direcaoAtual) {
		case DIREITA:
			proximaDirecao = DirecaoPopulador.ABAIXO;
			break;
		case ABAIXO:
			proximaDirecao = DirecaoPopulador.ESQUERDA;
			break;
		case ESQUERDA:
			proximaDirecao = DirecaoPopulador.ACIMA;
			break;
		case ACIMA:
			proximaDirecao = DirecaoPopulador.DIREITA;
			break;
		}
		return proximaDirecao;
	}

	private Boolean atualAtuaComoEsquina(Integer atual, Integer[] esquinas) {
		Boolean encontrado = false;
		Integer i = 0;
		while ((!encontrado) && (i < esquinas.length)) {
			encontrado = (atual == esquinas[i]);
			i++;
		}
		return encontrado;
	}

}
