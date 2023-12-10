package cl.usach.backend.loa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.usach.backend.loa.entity.PlanStudy;

@Repository
public interface AsignaturaRepository extends JpaRepository<PlanStudy, Integer>{
    
    List<PlanStudy> findAll();
    List<PlanStudy> findByCodigoCarerrInteger(Integer codigoCarerrInteger);
    
}
