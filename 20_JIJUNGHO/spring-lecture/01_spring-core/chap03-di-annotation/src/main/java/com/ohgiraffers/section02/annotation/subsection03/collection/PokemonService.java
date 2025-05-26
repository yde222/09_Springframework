package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pokemonServiceCollection")
public class PokemonService {
    /* 컬렉션 타입으로 의존성 주입을 받게 되면 해당 타입의 등록된 빈이 모두 주입된다. */
    private List<Pokemon> pokemon;

    public PokemonService(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.forEach(Pokemon::attack);
    }
}
