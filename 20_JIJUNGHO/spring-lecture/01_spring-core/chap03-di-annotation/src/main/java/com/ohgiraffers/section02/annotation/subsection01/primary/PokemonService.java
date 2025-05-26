package com.ohgiraffers.section02.annotation.subsection01.primary;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.stereotype.Service;

@Service("pokemonServicePrimary")
public class PokemonService {
    private Pokemon pokemon;
    
    // 생성자 주입
    public PokemonService(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
