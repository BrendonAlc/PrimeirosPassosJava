import java.util.Scanner;


/*
 Exerc�cio de fixa��o 1
Criar um programa para processar as seguintes informa��es de um aluno:
matr�cula, nome , nota1, nota2 e se ele est� aprovado ou reprovado;
Durante a execu��o calcular a nota final do aluno utilizando a seguinte
regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a
6 o aluno est� aprovado, caso contr�rio estar� reprovado;
O programa dever� imprimir o seguinte relat�rio:
Matr�cula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim ( ) N�o
Nota final: xxxxx
 */

public class Programa { //Inicio 

	public static void main(String[] args) { //Inicio do m�todo main
//		String matricula = "12345";
//		String nome = "Brendon Rodrigo";
//		double nota1 = 7.5;
//		double nota2 = 2.6;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a matr�cula: ");
		String matricula = leitor.nextLine();
		System.out.println("Digite a nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a nota1: ");
		double nota1 = leitor.nextDouble();
		//leitor.nextLine();
		
		System.out.println("Digite a nota2: ");
		double nota2 = leitor.nextDouble();
		//leitor.nextLine();
		
				
		double notaFinal = (nota1 + nota2) / 2;
		
		//double[] notas = new double [5] 
		
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Nome: " + nome);
		
		//igual ou maior a 6
		if(notaFinal >= 6) {
			System.out.println("Aprovado: (X)Sim  ( )N�o");			
		} else {
			System.out.println("Reprovado ( )Sim  (X)N�o");			
		}
		
		System.out.println("Nota final: " + notaFinal);
		
		leitor.close();
		
	}//Fim do m�todo main
} //Fim