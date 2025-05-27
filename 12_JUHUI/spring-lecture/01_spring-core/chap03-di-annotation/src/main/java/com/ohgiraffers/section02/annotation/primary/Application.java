package com.ohgiraffers.section02.annotation.primary;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName" + definitionName);
        }

        PokemonService pokemonService = applicationContext.getBean(PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
