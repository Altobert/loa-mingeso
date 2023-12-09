package cl.usach.backend.loa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "plan_estudios")
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
