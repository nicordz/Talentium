package cohorte16.homeservice.services;

import cohorte16.homeservice.models.Professional;

import java.util.List;

public interface ProfessionalService {
    List<Professional> findAll() throws Exception;
    Professional findById(Long id) throws Exception;
    Professional save(Professional professional) throws Exception;
    Professional update(Long id, Professional professional) throws Exception;
    boolean delete(Long id) throws Exception;
}
