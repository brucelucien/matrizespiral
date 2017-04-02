package matrizespiral.main;

public class ExemplosDeUso {
	
	private static final String SEPARADOR = "\n\n==============================";
	
	public static void main(String[] args) {
		MatrizEspiral matriz1x1 = new MatrizEspiral(1, 1);
		System.out.println(matriz1x1);
		
		System.out.println(SEPARADOR);
		
		MatrizEspiral matriz10x7 = new MatrizEspiral(10, 7);
		System.out.println(matriz10x7);
		
		System.out.println(SEPARADOR);
		
		MatrizEspiral matriz3x2 = new MatrizEspiral(3, 2);
		System.out.println(matriz3x2);
		
		System.out.println(SEPARADOR);
		
		MatrizEspiral matriz4x15 = new MatrizEspiral(4, 15);
		System.out.println(matriz4x15);
		
		System.out.println(SEPARADOR);
		
		MatrizEspiral matriz5x5 = new MatrizEspiral(5, 5);
		System.out.println(matriz5x5);
		
		System.out.println(SEPARADOR);
		
		MatrizEspiral matriz10x10 = new MatrizEspiral(10, 10);
		System.out.println(matriz10x10);
	}

}
