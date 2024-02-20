package cohorte16.homeservice.mappers;

import cohorte16.homeservice.dtos.ClientDTO;
import cohorte16.homeservice.models.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper {

    public ClientDTO clientToClientDTO(Client client) {
        return new ClientDTO(
                client.getName(),
                client.getLastname(),
                client.getDni(),
                client.getUrlImage(),
                client.getClassification(),
                client.getUser(),
                client.getDirection()
                //client.getOrder()
        );
    }

    public Client clientDTOToClient(ClientDTO clientDTO){
        return new Client(
                null,
                clientDTO.name(),
                clientDTO.lastname(),
                clientDTO.dni(),
                clientDTO.urlImage(),
                clientDTO.classification(),
                Boolean.TRUE,
                clientDTO.user(),
                clientDTO.direction()
                //clientDTO.order()
        );
    }
}
