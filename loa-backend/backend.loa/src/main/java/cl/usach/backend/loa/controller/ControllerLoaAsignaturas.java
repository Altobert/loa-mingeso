package cl.usach.backend.loa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.usach.backend.loa.entity.PlanStudy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/asignaturas")
public class ControllerLoaAsignaturas {

    //registro de asignaturas
        //registrar al menos tres asignaturas
        // consultar la cantidad maxima de asignaturas por nivel
        // solo puede cursar un ramo si aprobo su prerequisito
        // cuantas veces reprobo la asignatura
            //si es primer nivel, tres veces maximo
            //

    //revisar tope horario: 
        //si tiene tope de horario, no puede inscribir asignatura
    

    //mostrar alumnos inscritos
    @PostMapping("/registrarAsignatura")
    public ResponseEntity<PlanStudy> postMethodName(@RequestBody PlanStudy asignaturPlanStudy) {
        //TODO: registrar al menos tres asignaturas
        
        if(asignaturPlanStudy.getNivelInteger() == null){
            return ResponseEntity.badRequest().build();                        
        }
        if(asignaturPlanStudy.getCodigoAsignatura() == null){
            return ResponseEntity.badRequest().build();                        
        }
        return ResponseEntity.ok(asignaturPlanStudy);
    }

}
