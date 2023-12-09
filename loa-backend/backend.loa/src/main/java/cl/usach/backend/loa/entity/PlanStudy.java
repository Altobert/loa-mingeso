package cl.usach.backend.loa.entity;

import jakarta.persistence.Entity;
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

    private Integer codigoCarerrInteger;
    private Integer codigoPlan;
    private Integer nivelInteger;
    private Integer codigoAsignatura;
    private String nombreAsignatura;


}
