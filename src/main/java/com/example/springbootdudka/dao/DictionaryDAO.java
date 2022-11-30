package com.example.springbootdudka.dao;

import com.example.springbootdudka.models.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryDAO extends JpaRepository<Dictionary, Integer> {

}
