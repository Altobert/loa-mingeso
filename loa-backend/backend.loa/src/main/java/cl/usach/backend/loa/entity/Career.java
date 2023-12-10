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
@Table(name = "carreras")
public class Career {

    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codigo")
    private Integer codigoCareerInteger;
    
    @Column(name = "\"Nombre carrera\"")
    private String nombreCareerString;

}
