package br.edu.up;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.up.model.Veiculo;

public class Programa {

	static EntityManagerFactory emf;
	static EntityManager em;
	

	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();	
		menu();
		
	}

	public static void menu() {
		Scanner leitor = new Scanner(System.in);
			//leitor  = new Scanner(System.in);

			System.out.println("Escolha uma opção:                  ");		
			System.out.println("1 - Cadastrar Veículo               ");
			System.out.println("2 - Consultar                       ");
			System.out.println("3 - Editar                          ");
			System.out.println("4 - Deletar                         ");
			System.out.println("5 - Sair                            ");

			
			int opcao = leitor.nextInt();
			System.out.println("opção");
				switch (opcao) {
					case 1:
						cadastrar();
						break;
					case 2:
						consultar();
						break;
					case 3:
						alterar();
						break;
					case 4:
						excluir();
						break;
					case 5:
						System.out.println("****************************************");
						System.out.println("    Saída realizada com sucesso!        ");
						System.out.println("****************************************");
						break;
					default:
						System.out.println("opção inválida, informe o valor correto:");
	
						menu();
						break;
				}
			 
		}
	

	public static void cadastrar() {
		Scanner leitor = new Scanner(System.in);
			System.out.println("|---------------------------------------|");
			System.out.println("| Insira o nome do veículo:             |");
			System.out.println("|---------------------------------------|");
			String nomeveiculo = leitor.nextLine();
			System.out.println("|---------------------------------------|");
			System.out.println("| Qual a categoria deste veículo?       |");
			System.out.println("|---------------------------------------|");
			String catveiculo = leitor.nextLine();
			System.out.println("|---------------------------------------|");
			System.out.println("| Insira o valor deste veículo em Reais:|");
			System.out.println("|---------------------------------------|");
			double valorveiculo = leitor.nextDouble();
			System.out.println("Reuniu daddos");
			Veiculo cadastrarveiculo = new Veiculo();
			cadastrarveiculo.setVeiculo(nomeveiculo);
			cadastrarveiculo.setCategoria(catveiculo);
			cadastrarveiculo.setValor(valorveiculo);
			//System.out.println("Setou rm new obj: "+ cadastrarveiculo.toString());
			salvar(cadastrarveiculo);
			
			System.out.println("|---------------------------------------|");
			System.out.println("| Cadastrado com sucesso!               |");
			System.out.println("|---------------------------------------|");
			
			int id = cadastrarveiculo.getId();
			consultadireta(id);
			
		menu();
		
	}

	public static void consultar() {
		
		Scanner leitor = new Scanner(System.in);

			System.out.println("Insira o ID de cadastro:              ");

			int id = leitor.nextInt();
			
			consultadireta(id);

		menu();
	
	}
	
	public static void consultadireta(int id) {

		Veiculo consultaVeiculo = procurar(id);
		
		if(consultaVeiculo == null) {
			
			System.out.println(" Não foi possivel localizar este ID!   ");
			
			menu();
		}else{
		
		int idVeiculo = consultaVeiculo.getId();
		String nomeVeiculo = consultaVeiculo.getveiculo();
		String catVeiculo = consultaVeiculo.getCategoria();
		double valorVeiculo = consultaVeiculo.getValor();
				
		System.out.println("Id:" +idVeiculo );                    
		System.out.println("Nome: " +nomeVeiculo );
		System.out.println("Categoria: " +catVeiculo );
		System.out.println("Valor em reias: R$" +valorVeiculo );
		}
				
	}
	
	public static void alterar() {
				Scanner leitor = new Scanner(System.in);
				System.out.println("|---------------------------------------|");
				System.out.println("| Insira o id do cadastro para alterar: |");
				System.out.println("|---------------------------------------|");
				int id = leitor.nextInt();
				consultadireta(id);


				
				System.out.println(" Qual opção deseja alterar?            ");
				System.out.println(" 1 - Nome                              ");
				System.out.println(" 2 - Categoria                         ");
				System.out.println(" 3 - Valor em Reais                    ");
				System.out.println(" 4 - Voltar ao menu                    ");
				
				Veiculo alterarvalor = procurar(id);
				int num = leitor.nextInt();
				
				switch(num) {
				case 1:
					
					System.out.println("Para qual nome será alterado o veículo?");				
					String nomeveiculo = leitor.next();
					alterarvalor.setVeiculo(nomeveiculo);
					editar(alterarvalor);
					break;
				case 2:
					System.out.println("|---------------------------------------|");
					System.out.println("| Qual a nova categoria do veículo?     |");
					System.out.println("|---------------------------------------|");
					String catveiculo = leitor.next();
					
					alterarvalor.setCategoria(catveiculo);
					editar(alterarvalor);
					break;
				case 3:
					System.out.println("|---------------------------------------|");
					System.out.println("| Qual o novo valor do veículo?         |");
					System.out.println("|---------------------------------------|");
					double valorveiculo = leitor.nextDouble();
					alterarvalor.setValor(valorveiculo);
					editar(alterarvalor);
					break;
				case 4:
					menu();
					break;
				default:
					System.out.println(" Valor incorreto!");					
					alterar();
					break;
				
				}
				System.out.println(" Alterado com sucesso!");
				consultadireta(id);
			
			menu();
			
		}
	

	public static void excluir() {
			Scanner leitor = new Scanner(System.in);
			System.out.println("|---------------------------------------|");
			System.out.println("| Insira o id para excluir:             |");
			System.out.println("|---------------------------------------|");
			int id = leitor.nextInt();
				
			excluir(id);
		

		System.out.println(" Excluído com sucesso:                 ");

		menu();
	}
	
	
	public static Integer salvar(Veiculo veiculo) {
		em.getTransaction().begin();
		em.persist(veiculo);
		//System.out.println("In transaction veiculo is: " + veiculo.toString());
		em.getTransaction().commit();
		//System.out.println("Pos transaction veiculo is: " + veiculo.toString());
		return veiculo.getId();
		//return 1;
	}
	
	private static void editar(Veiculo alterarvalor) {
		em.getTransaction().begin();
		em.merge(alterarvalor);
		em.getTransaction().commit();
		
	}

	public static Veiculo procurar(int id) {
		Veiculo idveiculo = em.find(Veiculo.class, id);
		return idveiculo;
		
	}

	public static void excluir(Integer id) {
		Veiculo excluirVeiculo = em.find(Veiculo.class, id);
		em.getTransaction().begin();
		em.remove(excluirVeiculo);
		em.getTransaction().commit();
		
	}

	
}