package com.jsw.springdata.menu.repository;

import com.jsw.springdata.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
