package cohorte16.homeservice.services.impl;

import cohorte16.homeservice.dtos.ClientDTO;
import cohorte16.homeservice.exceptions.EntityNotSavedException;
import cohorte16.homeservice.mappers.ClientMapper;
import cohorte16.homeservice.mappers.ProfessionalMapper;
import cohorte16.homeservice.models.Client;
import cohorte16.homeservice.repositories.ClientRepository;
import cohorte16.homeservice.repositories.ProfessionalRepository;
import cohorte16.homeservice.services.ClientService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper){
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    @Override
    public ClientDTO save(ClientDTO clientDTO) throws Exception {
        try {
            Client clientEntity = clientMapper.clientDTOToClient(clientDTO);
            Client clientSaved = clientRepository.save(clientEntity);
            return clientMapper.clientToClientDTO(clientSaved);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public ClientDTO findById(Long id) throws Exception {
        try {
            Optional<Client> clientOptional = clientRepository.findById(id);
            if (clientOptional.isEmpty()) {
                throw new EntityNotFoundException("Client not found");
            }
            Client client = clientOptional.get();
            return clientMapper.clientToClientDTO(client);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<ClientDTO> findAll() throws Exception {
        try {
            List<Client> clientList = clientRepository.findAll();
            return clientList.stream().map(clientMapper::clientToClientDTO).toList();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public ClientDTO update(Long id, ClientDTO clientDTO) throws Exception {
        try {
            Optional<Client> clientOptional = clientRepository.findById(id);
            if(clientOptional.isEmpty()){
                throw new EntityNotSavedException("Client not found");
            }
            Client clientEntity = clientMapper.clientDTOToClient(clientDTO);
            Client clientUpdate = getClient(clientEntity,clientOptional);
            return clientMapper.clientToClientDTO(clientUpdate);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean delete(Long id) throws Exception {
        try {
            if(clientRepository.existsById(id)){
                Client client = clientRepository.findById(id).get();
                client.setActive(false);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    private static Client getClient(Client client,
                                                Optional<Client> clientOptional) {
        Client clientUpdate = clientOptional.get();
        clientUpdate.setName(clientUpdate.getName());
        clientUpdate.setLastname(client.getLastname());
        clientUpdate.setDni(client.getDni());
        clientUpdate.setClassification(client.getClassification());
        clientUpdate.setUrlImage(client.getUrlImage());
        clientUpdate.setActive(client.getActive());
        return clientUpdate;
    }

}
