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
@Table(name = "prerrequisitos")
public class PreRequirement {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cod_asig")
    private Integer codigoAsignatura;

    @Column(name = "cod_prerreq")
    private Integer codigoPreRequisito;

}
