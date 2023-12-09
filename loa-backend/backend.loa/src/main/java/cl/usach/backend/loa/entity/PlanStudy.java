package cl.usach.backend.loa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class PlanStudy {

    //codigo asignatura.
    //codigo prerequisito.
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Integer codigoCarerrInteger;
    private Integer codigoPlan;
    private Integer nivelInteger;
    private Integer codigoAsignatura;
    private String nombreAsignatura;


}
