package cl.usach.backend.loa.entity;

import jakarta.persistence.Column;
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
    
    @Column(name = "anio")
    private Integer anioInteger;

    @Column(name = "sem")
    private Integer semestreInteger;

    @Column(name = "cod_alumno")
    private String codigoAlumnoString;

    @Column(name = "cod_asig")
    private Integer codigoAsignaturaInteger;

    @Column(name = "nota")
    private String notaString;
}
