package com.ohgiraffers.associationmapping.section02.ontomany;

import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OneToManyService {

    private OneToManyRepository oneToManyRepository;

    public OneToManyService(OneToManyRepository oneToManyRepository) {
        this.oneToManyRepository = oneToManyRepository;
    }

    public Category findCategory(int categoryCode){
        Category category = oneToManyRepository.find(categoryCode);
        System.out.println("category ===>>> " + category);

        return category;
    }

    @Transactional
    public void registMenu(Menu menu) {
        
    }
}
