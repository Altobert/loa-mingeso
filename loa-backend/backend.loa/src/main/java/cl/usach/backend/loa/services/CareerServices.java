package cl.usach.backend.loa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.usach.backend.loa.entity.Career;
import cl.usach.backend.loa.repository.CareerRepository;

@Service
public class CareerServices {

    @Autowired
    CareerRepository careerRepository;

    //mostar todas las carreras
    public List<Career> getAllCareers() {
        return careerRepository.findAll();
    }

}
