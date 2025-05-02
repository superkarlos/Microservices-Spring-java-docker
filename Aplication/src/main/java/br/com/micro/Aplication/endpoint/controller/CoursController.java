package br.com.micro.aplication.endpoint.controller;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.micro.aplication.endpoint.services.CoursServices;
import br.com.micro.aplication.model.Course;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;


@RestController
@RequestMapping("/home")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CoursController {
     
    private final CoursServices services;
    @GetMapping("")
    public String getall() {
        return "oi"; // nome da view
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Course>> listar(Pageable pg){
        return new ResponseEntity<>(services.listIterable(pg), HttpStatus.OK);
    }
    
  
    
}
