package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import br.edu.up.modelo.Grupo;

public class Programa {
	
	public static void main(String[] args){
		
		
		// Carregar o arquivo
		Scanner leitor = getLeitor();
		if(leitor == null) {
			System.out.println("Não foi possível executar o programa!");
		} else {
			
			//2.Carregar os dados
			Grupo[] grupos = carregarDados(leitor);
			//System.out.println("Processar o arquivo...");
			
			gravarRelatorio(grupos);
		}
		
		System.out.println("Deu tudo certo! \o/");
	}
	
	public static void gravarRelatorio(Grupo[] grupos) {
		try {
					
			Formatter gravador = new Formatter("") //Colocar o caminho do arquivo txt
					
			for(int i = 0; i < grupos.length; i++) {
				Grupo grp = grupos[i];
				gravador.format("Valor do grupo " + grp.letra + ": " + grp.getValor());
				
				vlrTotal += grp.getValor();
			}
			gravador.format("Valor total: " + vlrTotal);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
		
			
	public static Grupo[] carreegarDados(Scanner leitor) {
			Grupo grupoA = new Grupo("A");
			Grupo grupoB = new Grupo("B");
			Grupo grupoC = new Grupo("C");
			Grupo grupoD = new Grupo("D");
			Grupo grupoE = new Grupo("E");
			Grupo grupoF = new Grupo("F");
			
			
			while(leitor.hasNext()) {
				String linha = leitor.nextLine();
				String[] dadosLinha = linha.split("\t"); //dados da linha
				switch(dadosLinha[0]) {
				case "A":
					grupoA.adicionarValor(dadosLinha[1]); 
					break;
				case "B":
					grupoB.adicionarValor(dadosLinha[1]); 
					break;
				case "C":
					grupoC.adicionarValor(dadosLinha[1]); 
					break;
				case "D":
					grupoD.adicionarValor(dadosLinha[1]); 
					break;
				case "E":
					grupoE.adicionarValor(dadosLinha[1]); 
					break;
				case "F":
					grupoF.adicionarValor(dadosLinha[1]); 
					break;
				}//switch
			}//while
			
			Grupo[] grupos = new Grupo[6];
			grupos[0] = grupoA;
			grupos[1] = grupoB;
			grupos[2] = grupoC;
			grupos[3] = grupoD;
			grupos[4] = grupoE;
			grupos[5] = grupoF;
			
			return grupos;
		}
	
	
	public static Scanner getLeitor() {
		File arquivo = new File("C:\\Users\\09107405936\\Documents\\PrimeirosPassosJava\\Ex06\\src\\br\\edu\\up\\grupos-tabulados.txt");
		
		Scanner leitor = null;
		try {
			leitor = new Scanner(arquivo);
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("O arquivo não foi encontrado!");
		}
		return leitor;
	
	}
		
}
