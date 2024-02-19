package cohorte16.homeservice.dtos;

import cohorte16.homeservice.models.Direction;
import cohorte16.homeservice.models.User;

public record ClientDTO(
        String name,
        String lastname,
        String dni,
        String urlImage,
        Integer classification,
        User user,
        Direction direction
) {

}