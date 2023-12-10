package cl.usach.backend.loa.services;

import org.springframework.stereotype.Service;

@Service
public class AsignaturaService {


    //consultar maximo de asignaturas por nivel
    public Integer consultarMaximoAsignaturasPorNivel(){        
        return null;
    }

    //consultar si aprobo prerrequisito
    public Boolean consultarSiAproboPrerrequisito(){
        return true;
    }

    //consultar cuantas veces reprobo la asignatura
    public Integer consultarCuantasVecesReproboAsignatura(){                
        return null;
    }

    //consultar reprobaciones por asignatura por nivel
    public Integer consultarReprobacionesPorAsignaturaPorNivel(){
        //Si es primer nivel, reprobaciones, tres veces maximo.

        //Si es segundo nivel, reprobaciones, dos veces maximo.
        return null;
    }

    //consultar tope horario
    public Boolean consultarTopeHorario(){
        return true;
    }

    

}
