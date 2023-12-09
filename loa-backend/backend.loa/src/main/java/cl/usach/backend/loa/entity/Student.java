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
@Table(name = "estudiantes")
public class Student {

    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rutStudentString;
    private String nombreStudentString;
    private String apellidoStudentString;
    private String correoStudentString;
    private String telefonoStudentString;
    private Integer idCarreraInteger;    

}
