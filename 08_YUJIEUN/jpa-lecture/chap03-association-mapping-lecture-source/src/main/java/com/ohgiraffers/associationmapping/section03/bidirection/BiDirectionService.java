package com.ohgiraffers.associationmapping.section03.bidirection;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiDirectionService {

    private BiDirectionRepository biDirectionRepository;

    public BiDirectionService(BiDirectionRepository biDirectionRepository) {
        this.biDirectionRepository = biDirectionRepository;
    }

    public Menu findMenu(int menuCode) {
        return biDirectionRepository.findMenu(menuCode);
    }

    @Transactional
    public Category findCategory(int categoryCode) {
        Category foundCategory
                = biDirectionRepository.findCategory(categoryCode);
        System.out.println("[ Category menuList ] "
                + foundCategory.getMenuList());
        /*
        * 양방향 참조를 구현
        * */
        return foundCategory;
    }


    @Transactional
    public void registMenu(Menu menu) {
        biDirectionRepository.saveMenu(menu);
    }

    @Transactional
    public void registCategory(Category category) {
        biDirectionRepository.saveCategory(category);
    }
}
