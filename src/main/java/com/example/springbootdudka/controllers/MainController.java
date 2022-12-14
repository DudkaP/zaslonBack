package com.example.springbootdudka.controllers;

import com.example.springbootdudka.dao.DictionaryDAO;
import com.example.springbootdudka.models.Dictionary;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class MainController {

    private DictionaryDAO dictionaryDAO;

    @PostMapping("/")
    public void saveDictionaryJSONBody(@RequestBody Dictionary dictionary){
        dictionaryDAO.save(dictionary);
    }
    @GetMapping("/keys")
    public ResponseEntity<List<Dictionary>> GetKeys(){
        List<Dictionary> all = dictionaryDAO.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
    @GetMapping("/key/{id}")
    public ResponseEntity<Dictionary> GetValue(@PathVariable int id){
        Optional<Dictionary> byId = dictionaryDAO.findById(id);
        return new ResponseEntity<>(byId.get(), HttpStatus.OK);
    }
}
