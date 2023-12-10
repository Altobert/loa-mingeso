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
@Table(name = "estudiantes")
public class Student {

    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @Column(name = "\"Rut\"")
    private String rutStudentString;
    
    
    @Column(name = "\"Nombres\"")
    private String nombreStudentString;
    
    @Column(name = "\"Apellidos\"")
    private String apellidoStudentString;
    
    @Column(name = "\"Email\"")
    private String correoStudentString;

    @Column(name = "cod_carr")        
    private Integer codigoCarerrInteger;    

}
