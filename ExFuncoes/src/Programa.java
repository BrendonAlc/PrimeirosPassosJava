public class ExFuncoes {
	
	
	//fun��es que n�o retorna nada (void)
	public static void imprimir(String txt) {
		System.out.println(txt);
	}
	
	//fun��o void retorna vazio, neste caso precisa informar o double
	public static double somar(double a, double b) {
		double vlr = a + b;
		return vlr;
		
	}
	
	//subtrair
	
	//multiplicar 
	
	//dividir
	
	public static void main (String[] args){ // TODO auto-generated method
		
		/*
		 * int valor1 = 100; int valor2 = 50; int resultado = valor1 + valor2;
		 * //System.out.println(valor); // syso CTRL + ESPA�O auto-completa
		 * 
		 * String texto = String.valueOf(resultado); imprimir(texto); }
		 * 
		 * public static void imprimir(String txt) { System.out.println(txt);
		 */
		
		double valor1 = 100;
		double valor2 = 50;
		//double resultado = valor1 + valor2;
		
		double resultado = somar(valor1 + valor2);
		
		//System.out.println(valor); // syso CTRL + ESPA�O auto-completa
		
		String texto = String.valueOf(resultado); // para realizar convers�o de valor para texto
		imprimir(texto);
	}
	
	
}