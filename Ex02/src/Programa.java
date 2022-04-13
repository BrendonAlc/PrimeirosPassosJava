import java.util.Scanner;
public class Programa {
	
	
	/*	
	import java.util.Scanner;
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		String[] nomes = new String[3];
		
		for( int i = 0; i < 3; i++){
			System.out.println("Digite o nome " + (i + 1) + ":");
		nomes[i] = leitor.nextLine();
		
		}
		
		for( int i = 0; i < 3; i++){
			System.out.println("Nome: " + nomes[i]);
		}
		
	
		leitor.close();
		
	*/
	
	public static void main(String[] args) {
		
		String[] matriculas = new String[5];
		
		for( int i = 0; i <= 4; i++) {
			System.out.println("Digite a matrícula " + (i + 1) + ":");
		}
		
		for( int i = 0; i <= 4; i++) {
			System.out.println("Matrícula: " + matriculas[i]);
		}
		
		String[] nomes = new String[5];
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite o nome" + (i + 1) + ":");
		}
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Nome: " + nomes[i]);
		}
				
		double[] notas1 = new double[5];
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite a nota" + (i + 1) + ":");
		}
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Nota: " + notas1[i]);
		}
			
		double[] notas2 = new double[5];
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Digite a nota" + (i + 1) + ":");
		}
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Nota:" + notas2[i]);
		}
		
		
		for (notasFinal <= 6);
			
		double notasFinal = (notas1[0] + notas2[0]) / 2;
		double notasFinal = (notas1[1] + notas2[1]) / 2;
		double notasFinal = (notas1[2] + notas2[2]) / 2;
		double notasFinal = (notas1[3] + notas2[3]) / 2;
		double notasFinal = (notas1[4] + notas2[4]) / 2;
		
			
			
		System.out.println("Nota "+nomes[0] + ": " + notasFinal);
		System.out.println("Nota "+nomes[1] + ": " + notasFinal);
		System.out.println("Nota "+nomes[2] + ": " + notasFinal);
		System.out.println("Nota "+nomes[3] + ": " + notasFinal);
		System.out.println("Nota "+nomes[4] + ": " + notasFinal);
		
		
		if(notasFinal[0] >= 6) {
			System.out.println("Aluno " + nomes[0] + " : Aprovado!");			
		} else {
			System.out.println("Aluno " + nomes[0] + " : Reprovado!");			
		}
		
		if(notasFinal[1] >= 6) {
			System.out.println("Aluno " + nomes[1] + " : Aprovado!");			
		} else {
			System.out.println("Aluno " + nomes[1] + " : Reprovado!");			
		}
		
		if(notasFinal[2] >= 6) {
			System.out.println("Aluno " + nomes[2] + " : Aprovado!");			
		} else {
			System.out.println("Aluno " + nomes[2] + " : Reprovado!");			
		}
		
		if(notasFinal[3] >= 6) {
			System.out.println("Aluno " + nomes[3] + " : Aprovado!");			
		} else {
			System.out.println("Aluno " + nomes[3] + " : Reprovado!");			
		}
		
		if(notasFinal[4] >= 6) {
			System.out.println("Aluno " + nomes[4] + " : Aprovado!");			
		} else {
			System.out.println("Aluno " + nomes[4] + " : Reprovado!");			
		}
		
	}

}