package com.javaguides.itemsspringbootapp.repository;

import com.javaguides.itemsspringbootapp.entity.items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<items,Long> {
}
