package br.com.micro.aplication.endpoint.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.micro.aplication.model.Course;
import br.com.micro.aplication.respository.CourserRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CoursServices {
    
    @Autowired 
    private CourserRepository repository;
    
    public List<Course> lista(){
        return repository.findAll();
    }

    public Iterable<Course> listIterable(Pageable pageable){
        log.info("Listagen no service");
        return repository.findAll(pageable);
    }
}
