import java.util.Scanner;


public class programa2 {
	/*Declara��o dos m�todos*/
	public int som(int num1, int num2) {
	  
		return num1 + num2;
		
	}
	public int sub(int num1, int num2){
	   
		return num1 - num2;
		
	}
	public int div(int num1,int num2){
	    
		return num1 / num2;
		
	}
	public int mult(int num1, int num2){
	     
		return num1 * num2;
		
	}
	
	
	
	public static void main (String args[]){
		

		
		//declarando as var�aveis
		int opcao = 5;
		int num1;
		int num2;
		
	      Scanner input = new Scanner(System.in);  
	      
	      
		System.out.println("-Escolha uma op��o-");
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtracao");  
	    System.out.println("3. Divis�o");  
	    System.out.println("4. Multiplica��o");  
	    System.out.println("0. Sair");  
	    System.out.println("Opera��o: ");  
	    
	    opcao = input.nextInt();
	    
	    while (opcao != 0) {
	    	
	    
	    	if (opcao == 1) {  		
	    	    Scanner input1 = new Scanner(System.in);  
	  	      
	    		System.out.println("Qual o primeiro numero: ");
	    		 num1 = input1.nextInt();
	    		System.out.println("Qual o segundo numero: ");
	    		 num2 = input1.nextInt();
	    		 
	    			
	    			
	    			System.out.println("A soma �:"+ (num1 + num2));
	    		break;
	    	}
	    	 	if (opcao == 2) {
		    		
	    	 		  Scanner input1 = new Scanner(System.in);  
	    	  	      
	  	    		System.out.println("Qual o primeiro numero: ");
	  	    		 num1 = input1.nextInt();
	  	    		System.out.println("Qual o segundo numero: ");
	  	    		 num2 = input1.nextInt();

	  	    			
	  	    			System.out.println("A subtra��o �:"+ (num1 - num2));
		    		
		    		break;
		    		}
		    	 	if (opcao == 3) {
		    	 		  Scanner input1 = new Scanner(System.in);  
		    	  	      
		  	    		System.out.println("Qual o primeiro numero: ");
		  	    		 num1 = input1.nextInt();
		  	    		System.out.println("Qual o segundo numero: ");
		  	    		 num2 = input1.nextInt();
		  	    		 
		  	    		if (num1 == 0 || num2==0) {
		  	    			 System.out.println("N�o � poss�vel fazer divis�o por 0!");
							
						}

		  	    			
		  	    			System.out.println("A divis�o �:"+ (num1 / num2));
			    		break;
		    	 	}
			    	 	if (opcao == 4) {
			    	 		  Scanner input1 = new Scanner(System.in);  
			    	  	      
			  	    		System.out.println("Qual o primeiro numero: ");
			  	    		 num1 = input1.nextInt();
			  	    		System.out.println("Qual o segundo numero: ");
			  	    		 num2 = input1.nextInt();

			  	    			
			  	    			System.out.println("A multiplica��o �:"+ (num1 * num2));
				    		break;
				    		}
			    	 	else{
					    		System.out.println("????");
					    		break;
					    		}
				    
	    }
	}
}