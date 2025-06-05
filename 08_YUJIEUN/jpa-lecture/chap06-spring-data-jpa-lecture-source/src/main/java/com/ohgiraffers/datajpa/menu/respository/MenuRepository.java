package com.ohgiraffers.datajpa.menu.respository;

import com.ohgiraffers.datajpa.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> mu
}
