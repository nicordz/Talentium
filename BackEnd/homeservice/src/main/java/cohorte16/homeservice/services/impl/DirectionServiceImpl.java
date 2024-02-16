package cohorte16.homeservice.services.impl;

import cohorte16.homeservice.models.Direction;
import cohorte16.homeservice.repositories.DirectionRepository;
import cohorte16.homeservice.services.DirectionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectionServiceImpl implements DirectionService{

    @Autowired
    private DirectionRepository directionRepository;

    @Override
    @Transactional
    public List<Direction> findAll() throws Exception {
        try{
            List<Direction> directions = directionRepository.findAll();
            return  directions;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Direction findById(Long id) throws Exception {
        try{
            Optional<Direction> directionOptional = directionRepository.findById(id);
            return directionOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Direction save(Direction direction) throws Exception {
        try{
            direction = directionRepository.save(direction);
            return direction;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Direction update(Long id, Direction direction) throws Exception {
        try {
            Optional<Direction> directionOptional = directionRepository.findById(id);
            if (directionOptional.isPresent()) {
                Direction directionToUpdate = directionOptional.get();
                directionToUpdate.setStreet(direction.getStreet());
                directionToUpdate.setNumber(direction.getNumber());
                directionToUpdate.setProvince(direction.getProvince());
                directionToUpdate.setLocation(direction.getLocation());
                directionToUpdate = directionRepository.save(directionToUpdate);
                return directionToUpdate;
            } else {
                throw new Exception("Direction not found with id: " + id);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try{
            if(directionRepository.existsById(id)){
                directionRepository.deleteById(id);
            }
            return true;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
