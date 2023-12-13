package cl.usach.backend.loa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.usach.backend.loa.entity.Career;
import cl.usach.backend.loa.services.CareerServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/carrera")
public class ControllerCarrera {

    //mostrar carreras
    //mostrar asignaturas de una carrera
    //mostrar alumnos de una carrera
    //mostrar profesores de una carrera

    //obtener carreras por id
    
    @Autowired
    CareerServices careerServices;
    
    @GetMapping("/obtenerCarreras")
    public ResponseEntity<List<Career>> obtenerCarreras() {
        List<Career> listCareers =  careerServices.getAllCareers();
        return ResponseEntity.ok(listCareers);
    }
    
    
    
}

