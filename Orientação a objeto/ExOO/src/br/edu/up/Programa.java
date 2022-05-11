package br.edu.up;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Animal;
import br.edu.up.model.Cachorro;
import br.edu.up.model.Gato;
import br.edu.up.model.Homem;
import br.edu.up.model.Humano;
import br.edu.up.model.Mulher;

public class Programa {

	public static void main(String[] args) {
		
		try {
			
			//List listaDeObjetos = new ArrayList();  Criada para uma lista especifica
			
			List<Animal> listaDeAnimais = new ArrayList();
			List<Cachorro> listaDeCachorros = new ArrayList();
		
		Cachorro cachorro1 = new Cachorro(); //cachorro1 � o objeto
		cachorro1.raca = "Rottweiler";
		cachorro1.nome = "Eros";
		cachorro1.setIdade(3);
		cachorro1.porte = "M�dio";
		
		listaDeCachorros.add(cachorro1);
		listaDeAnimais.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.raca = "Vira-Lata";
		cachorro2.nome = "Suzi";
		cachorro2.setIdade(3);
		cachorro2.porte = "Pequeno";
		
		listaDeCachorros.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.raca = "Vira-Lata";
		cachorro3.nome = "Goa";
		cachorro3.setIdade(2);
		cachorro3.porte = "M�dio";
		
		listaDeCachorros.add(cachorro3);
		
		
		Gato umObjetoQualquer = new Gato();
		umObjetoQualquer.setIdade(4);
		umObjetoQualquer.nome = "Fred";
		
		//N�o � poss�vel adicionar na lista de cachorro quando for diferente de cachorro
		listaDeAnimais.add(umObjetoQualquer); //Pode adicionar na lista de animal porque � Heran�a do Objeto PAI
		
		Homem umHomemQualquer = new Homem();
		umHomemQualquer.setIdade(54);
		umHomemQualquer.nome = "Gabriel";
		
		Humano humano = new Humano();
		humano.setIdade(-96);
		humano.nome = "Elizabeth";
		
		
		Mulher mulher = new Mulher();
		mulher.setIdade(43);
		mulher.nome = "Cleonice";
		
		for (Animal animal : listaDeAnimais) {
			System.out.println("Nome: " + animal.nome);
			System.out.println("Idade: " + animal.getIdade);
			System.out.println();
			
		}
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
				
	}

}
