package cl.usach.backend.loa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.usach.backend.loa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

    List<Student> findByRutStudentString(String rutStudentString);
    List<Student> findByNombreStudentString(String nombreStudentString);
    List<Student> findAll();
    
}
