import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\09107405936\\Documents\\PrimeirosPassosJava\\Exclass\\src\\alunos.csv");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
//		aluno aluno1 = new aluno();
//		aluno1.matricula = "12345";
//		aluno1.nome = "João";
//		aluno1.nota1 = 7.8;
//		aluno1.nota2 = 8.3;
//		aluno1.nota3 = 5.6;
//		
//		
//		aluno aluno2 = new aluno();
//		aluno2.matricula = "67894";
//		aluno2.nome = "Pedro";
//		aluno2.nota1 = 6.8;
//		aluno2.nota2 = 9.3;
//		aluno2.nota3 = 3.6;
//		
//		aluno[] alunos = new aluno[2];
//		alunos[0] = aluno1;
//		alunos[1] = aluno2;
		
		aluno[] alunos = new aluno[5];
		int contador = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split(";"); // split para realizar a quebra a partir do caractere informado
			String matricula = dados [0];
			String nome = dados[1];
			String nota1 = dados[2];
			String nota2 = dados[3];
			String nota3 = dados[4];
			System.out.println(linha);
			
			aluno aluno = new aluno();
			aluno.matricula = "12345";
			aluno.nome = "João";
			aluno.nota1 = Double.parseDouble(nota1);
			aluno.nota2 = Double.parseDouble(nota2);
			aluno.nota3 = Double.parseDouble(nota3);
			
			alunos[contador] = aluno;
			contador++;
		}
		
		
		for(int i = 0; i < alunos.length; i++){
			aluno a = alunos[i];
			System.out.println("Matrícula: " + a.matricula);
			System.out.println("Nome: " + a.nome);
			System.out.println("Nota 1: " + a.nota1);
			System.out.println("Nota 2: " + a.nota2);
			System.out.println("Nota 3: " + a.nota3);
			System.out.println();
		}
		
		leitor.close();
		
	}

}