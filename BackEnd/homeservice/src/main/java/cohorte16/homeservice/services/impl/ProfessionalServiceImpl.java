package cohorte16.homeservice.services.impl;

import cohorte16.homeservice.exceptions.EntityNotSavedException;
import cohorte16.homeservice.models.Professional;
import cohorte16.homeservice.repositories.ProfessionalRepository;
import cohorte16.homeservice.services.ProfessionalService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessionalServiceImpl implements ProfessionalService {
    @Autowired
    private ProfessionalRepository professionalRepository;

    @Override
    @Transactional
    public List<Professional> findAll() throws Exception {
       try {
          return professionalRepository.findAll();
       }catch (Exception e){
           throw new Exception(e.getMessage());
       }
    }

    @Override
    @Transactional
    public Professional findById(Long id) throws Exception {
        try {
            Optional<Professional> professionalOptional = professionalRepository.findById(id);
            if(professionalOptional.isEmpty()){
                throw new EntityNotFoundException("User not found");
            }
            return professionalOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Professional save(Professional professional) throws Exception {
        try{
            return professionalRepository.save(professional);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Professional update(Long id, Professional professional) throws Exception {
        try {
            Optional<Professional> professionalOptional = professionalRepository.findById(id);
            if(professionalOptional.isEmpty()){
                throw new EntityNotSavedException("User not found");
            }
            Professional professionalUpdated = getProfessional(professional, professionalOptional);
            return professionalRepository.save(professionalUpdated);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if(professionalRepository.existsById(id)){
                Professional professional = professionalRepository.findById(id).get();
                professional.setActive(Boolean.FALSE);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    private static Professional getProfessional(Professional professional,
                                         Optional<Professional> professionalOptional) {
        Professional professionalUpdated = professionalOptional.get();
        professionalUpdated.setName(professionalUpdated.getName());
        professionalUpdated.setLastname(professional.getLastname());
        professionalUpdated.setCbu(professional.getCbu());
        professionalUpdated.setCuit(professional.getCuit());
        professionalUpdated.setProfession(professional.getProfession());
        professionalUpdated.setClassification(professional.getClassification());
        professionalUpdated.setUrlImage(professional.getUrlImage());
        professionalUpdated.setActive(professional.isActive());
        return professionalUpdated;
    }

}
