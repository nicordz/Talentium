package cohorte16.homeservice.services;

import cohorte16.homeservice.models.Direction;

import java.util.List;

public interface DirectionService {
    public List<Direction> findAll() throws Exception;

    public Direction findById(Long id) throws Exception;

    public Direction save(Direction direction) throws Exception;

    public Direction update(Long id, Direction direction) throws Exception;

    public boolean delete(Long id) throws Exception;


}
