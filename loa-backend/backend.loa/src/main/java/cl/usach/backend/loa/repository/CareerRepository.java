package cl.usach.backend.loa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.usach.backend.loa.entity.Career;

@Repository
public interface CareerRepository extends JpaRepository<Career, Integer>{

    List<Career> findAll();
    
}
