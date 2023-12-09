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
@Table(name = "notas")
public class Calification {

    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Integer idCalificationInteger;
    private Integer anioInteger;
    private Integer semestreInteger;
    private Integer codigoAlumnoInteger;
    private Integer codigoAsignaturaInteger;
    private Float notaFloat;
}
