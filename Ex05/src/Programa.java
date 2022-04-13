import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File arquivo = new File("C:\\Users\\09107405936\\Documents\\PrimeirosPassosJava\\Ex05\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine(); //descarta o título
		
		int grupoA = 0;
		int grupoB = 0;
		int grupoC = 0;
		int grupoD = 0;
		int grupoE = 0;
		int grupoF = 0;
		
		while (leitor.hasNext()) {
			String linha = leitor.nextLine();
			//System.out.println(linha);
			
			String[] dadosLinha = linha.split("\t");
		//	System.out.println("Grupo: " + dadosLinha[0]);
		//	System.out.println("Valor: " + dadosLinha[1]);
		//	System.out.println("-----------------------");
			
			
			//Para verificação, se ja existir ele executa o case.
			switch(dadosLinha[0]) {
			case "A":
				grupoA += getValor(dadosLinha[1]);
				break;
			case "B":
				grupoB += getValor(dadosLinha[1]);
				break;
			case "C":
				grupoC += getValor(dadosLinha[1]);
				break;
			case "D":
				grupoD += getValor(dadosLinha[1]);
				break;
			case "E":
				grupoE += getValor(dadosLinha[1]);
				break;
			case "F":
				grupoF += getValor(dadosLinha[1]);
				break;
			
			}
		}
		
		//Para imprimir informações do grupo conforme função imprimirGrupo
		imprimirGrupo("A",grupoA);
		imprimirGrupo("B",grupoB);
		imprimirGrupo("C",grupoC);
		imprimirGrupo("D",grupoD);
		imprimirGrupo("E",grupoE);
		imprimirGrupo("F",grupoF);
		
		int total = grupoA + grupoB + grupoC + grupoD + grupoE + grupoF;
			System.out.println("Valor total: " + total);
		
			leitor.close();
			}
			
			public static void imprimirGrupo(String letra, int vlr) {
				System.out.println("Valor total do grupo "+letra+": " + vlr);
			}
			
			//função para simplificar o valor a ser trazido para os grupos
			public static int getValor(String vlr) {
				return Integer.parseInt(vlr);
			}

		}
			
			
		/*	
			if(dadosLinha[0].equals("A")) {
				System.out.println(dadosLinha[1]);
				//int valor = Integer.parseInt(dadosLinha[1]);
				//grupoA = grupoA + valor;
				//grupoA += valor;
				//grupoA += Integer.parseInt(dadosLinha[1]);
				grupoA += getValor(dadosLinha[1]);
				
			}
			
			if(dadosLinha[0].equals("B")) {
				System.out.println(dadosLinha[1]);
				int valor = Integer.parseInt(dadosLinha[1]);
				
			}
			
			if(dadosLinha[0].equals("C")) {
				System.out.println(dadosLinha[1]);
			}
			
			if(dadosLinha[0].equals("D")) {
				System.out.println(dadosLinha[1]);
			}
			
			if(dadosLinha[0].equals("E")) {
				System.out.println(dadosLinha[1]);
			}
			
			if(dadosLinha[0].equals("F")) {
				System.out.println(dadosLinha[1]);
			}
		
		*/	
			
			//calcular o total por grupo
			
			//calcular o total geral
		
		
		
		// System.out.println("Valor total do grupo A: " + grupoA); Para imprimir valor somente do grupoA
	