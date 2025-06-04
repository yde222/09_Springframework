package com.ohgiraffers.datajpa.main.service;

import com.ohgiraffers.datajpa.main.repository.MenuRepository;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

}
