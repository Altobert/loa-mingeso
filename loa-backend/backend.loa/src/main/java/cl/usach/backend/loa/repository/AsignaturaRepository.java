package cl.usach.backend.loa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.usach.backend.loa.entity.PlanStudy;

@Repository
public interface AsignaturaRepository extends JpaRepository<PlanStudy, Integer>{
    
    List<PlanStudy> findByNivelInteger(Integer nivelInteger);

    List<PlanStudy> findByPlanStudies(Integer codigoAsignatura);

    List<PlanStudy> findByCodigoAsignatura(Integer codigoAsignatura);

    List<PlanStudy> findByCodigoCarerrInteger(Integer codigoCarerrInteger);

    List<PlanStudy> findByCodigoPlan(String codigoPlan);

    List<PlanStudy> findByNombreAsignatura(String nombreAsignatura);
    
}
