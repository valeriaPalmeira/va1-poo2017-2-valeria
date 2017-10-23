package br.unincor.controle;

import java.util.ArrayList;
import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;
import br.unincor.view.Usuario;

public class Main {

	public static void main(String[] args) {
		Operacoes o = new Operacoes();
		Usuario u =  new Usuario();
		List<Pokemon> listaPokemon = new ArrayList<Pokemon>();
		
		
		Long nPokemon = u.recebeLong("Entre com a quantidade de Pokemons");
		
		if(nPokemon != null){
			
			for(int i = 0; i < nPokemon; i++){
				Pokemon p = new Pokemon("Pokemon" + i, 
						"Tipo" + i, 0D, 0D);
				listaPokemon.add(p);
			}
			
			for (int i = 0; i < listaPokemon.size(); i++){
				try {
					o.evoluir(listaPokemon.get(i));
				} catch (EvolucaoException e) {
					u.exibeMsgErro(e.getMessage());
				}
			}
			
			u.exibeMsg("Maior CP\n" + o.maiorCp(listaPokemon).toString());
			u.exibeMsg("Menor CP\n" + o.menorCp(listaPokemon).toString());
			
		}
		
		
		
	}

}
