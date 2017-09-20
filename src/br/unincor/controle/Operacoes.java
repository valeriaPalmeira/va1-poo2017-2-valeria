package br.unincor.controle;

import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;

public class Operacoes {
	
	/**
	 * Fazer com que este método não retorne nada e
	 * lance a 'EvolucaoException' quando o pokemon
	 * não estiver com CP para evoluir. Sempre
	 * que o pokemon não estiver com no mínimo de CP
	 * lance a 'EvolucaoException'. Se estiver com pelo
	 * menos o mínimo de CP, setar 1 no CP deste pokemon.
	 */
	public boolean evoluir(Pokemon p) throws EvolucaoException {
		Double c = Math.random()*100+10;
		if(c < 50){
		}
		return true;
	}
	
	public Pokemon maiorCp(List<Pokemon> listaPokemons) {
		Pokemon pokemonMaiorCp = listaPokemons.get(0);
		
		for (Pokemon pokemon : listaPokemons) {
			if(pokemon.getCp() > pokemonMaiorCp.getCp())
				pokemonMaiorCp = pokemon;
		}
		return pokemonMaiorCp;
	}
	
	public Pokemon menorCp(List<Pokemon> listaPokemons) {
		Pokemon pokemonMenorCp = listaPokemons.get(0);
		
		for (Pokemon pokemon : listaPokemons) {
			if(pokemon.getCp() < pokemonMenorCp.getCp())
				pokemonMenorCp = pokemon;
		}
		return pokemonMenorCp;
	}

}
