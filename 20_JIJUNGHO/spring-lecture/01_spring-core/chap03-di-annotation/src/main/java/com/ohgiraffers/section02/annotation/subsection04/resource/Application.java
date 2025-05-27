package com.ohgiraffers.section02.annotation.subsection04.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName = " + definitionName);
        }

        PokemonService pokemonService = applicationContext.getBean(PokemonService.class);
        pokemonService.pokemonAttack();

    }
}
