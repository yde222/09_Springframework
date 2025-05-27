package com.ohgiraffers.section02.annotation.subsection05.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }

        PokemonService pokemonService = context.getBean(PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
