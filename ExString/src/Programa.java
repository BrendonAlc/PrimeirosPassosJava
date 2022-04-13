import java.util.Iterator;

public class Programa {
	
	public static void main(String[] args) {
		
		//Tipo primitivo
		//int numero = 100;
		//numero.
		
		//Classe -> variável é um objeto.
		String texto = "Só sei que nada sei. (Sócrates)";
		int comprimento = texto.length(); //Quanto de caractere tem o texto
		
		System.out.println("Comprimento: " + comprimento);
		String subTexto = texto.substring(5, 15); //substring é uma função que acessa aos caracteres
		System.out.println("Sub: " + subTexto);
		
		char caractere = texto.charAt(9);
		System.out.println("Char: " + caractere);
		
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
			
		String[] palavras = texto.split(" ");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		String textoHifen = texto.replace(" ", "-");
		System.out.println(textoHifen);
		
		String textoTab = texto.replace(" ","	");
		System.out.println(textoTab);
		String[] palavrasTab = textoTab.split("\t"); // \t para utilizar tabulação
		for (String palavra : palavrasTab) {
			System.out.println(palavra);
		}
		
		
	}

}