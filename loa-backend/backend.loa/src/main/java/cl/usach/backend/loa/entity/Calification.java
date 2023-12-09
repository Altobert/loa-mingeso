package cl.usach.backend.loa.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Calification {

    private Integer anioInteger;
    private Integer semestreInteger;
    private Integer codigoAlumnoInteger;
    private Integer codigoAsignaturaInteger;
    private Float notaFloat;
}
