import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a matrícula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome:");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		
		int contador = 0;
		do {
			System.out.println("Informar uma nota entre 0 e 10.");
			System.out.println("Digite a " + (contador + 1) + "a nota:");
			double temp = leitor.nextDouble();
			
			if (temp < 0 || temp > 10) {
				//inválido
				System.out.println("A nota " + temp + " é inválida!");
			} else {
				notas[contador] = temp;
				contador++;
			}
			
			
			
	//		if (temp >= 0 && temp <= 10) {
	//			notas[contador] = temp;
	//			contador++;
	//		}else {
	//			System.out.println("A nota " + temp + " é inválida!");
	//		}
		}while (contador < 5);
		
		System.out.println();
		System.out.println("-----------RELATÓRIO-----------");
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i +1) + ":" + notas[i]);
		}
		leitor.close();
	}
}