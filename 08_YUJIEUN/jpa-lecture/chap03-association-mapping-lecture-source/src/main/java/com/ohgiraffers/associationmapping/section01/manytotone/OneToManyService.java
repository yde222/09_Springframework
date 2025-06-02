package com.ohgiraffers.associationmapping.section01.manytotone;

@service
public class OneToManyService {

    private OneToManyRepository repository;

    public OneToManyService(OneToManyRepository repository) {
        this.repository = repository;
    }

    public  Category findCategory(int categoryCode){
        Category category = OneToManyRepository.find(categoryCode);
        return category;
    }
}
