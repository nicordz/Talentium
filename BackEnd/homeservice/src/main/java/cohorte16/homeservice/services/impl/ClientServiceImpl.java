package cohorte16.homeservice.services.impl;

import cohorte16.homeservice.exceptions.EntityNotSavedException;
import cohorte16.homeservice.models.Client;
import cohorte16.homeservice.repositories.ClientRepository;
import cohorte16.homeservice.services.ClientService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    @Override
    @Transactional
    public Client save(Client client) throws Exception {
        try {
            return clientRepository.save(client);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Client findById(Long id) throws Exception {
        try {
            Optional<Client> clientOptional = clientRepository.findById(id);
            if (clientOptional.isEmpty()) {
                throw new EntityNotFoundException("Client not found");
            }
            return clientOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<Client> findAll() throws Exception {
        try {
            return clientRepository.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Client update(Long id, Client client) throws Exception {
        try {
            Optional<Client> clientOptional = clientRepository.findById(id);
            if(clientOptional.isEmpty()){
                throw new EntityNotSavedException("Client not found");
            }
            Client clientUpdated = getClient(client, clientOptional);
            return clientRepository.save(clientUpdated);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
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
