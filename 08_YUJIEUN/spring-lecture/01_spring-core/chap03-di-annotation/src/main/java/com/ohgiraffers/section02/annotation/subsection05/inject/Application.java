package com.ohgiraffers.section02.annotation.subsection05.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.ohgiraffers.section02");

        String[] difinitionNames = applicationContext.getBeanDefinitionNames();
        for(String difinitionName : difinitionNames) {
            System.out.println("difinitionName = " + difinitionNames);
        }

        PokemonService pokemonService = applicationContext.getBean(PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
