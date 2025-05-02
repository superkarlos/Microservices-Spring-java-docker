package br.com.micro.aplication.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.micro.aplication.model.Course;

@Repository
public interface CourserRepository extends JpaRepository<Course,Long> {

    
} 