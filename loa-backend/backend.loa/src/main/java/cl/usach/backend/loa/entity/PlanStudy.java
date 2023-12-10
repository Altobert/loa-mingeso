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
@Table(name = "plan_estudios")
public class PlanStudy {

    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cod_carr")
    private Integer codigoCarerrInteger;

    @Column(name = "cod_plan")
    private String codigoPlan;

    @Column(name = "nivel")
    private Integer nivelInteger;

    @Column(name = "cod_asig")
    private Integer codigoAsignatura;

    @Column(name = "nom_asig")
    private String nombreAsignatura;


}
