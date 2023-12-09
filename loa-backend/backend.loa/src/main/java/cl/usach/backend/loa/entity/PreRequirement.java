package cl.usach.backend.loa.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class PreRequirement {

    //codigo asignatura.
    //codigo prerequisito.

    private Integer codigoAsignatura;
    private Integer codigoPreRequisito;

}
