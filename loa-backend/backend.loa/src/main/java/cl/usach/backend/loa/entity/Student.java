package cl.usach.backend.loa.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Student {

    private String rutStudentString;
    private String nombreStudentString;
    private String apellidoStudentString;
    private String correoStudentString;
    private String telefonoStudentString;
    private Integer idCarreraInteger;    

}
