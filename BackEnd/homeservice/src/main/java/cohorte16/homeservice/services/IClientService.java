package cohorte16.homeservice.services;

import cohorte16.homeservice.models.Client;

import java.util.List;

public interface IClientService {
    Client save(Client client) throws Exception;
    Client findById(Long id) throws Exception;
    List<Client> findAll() throws  Exception;
    Client update(Long id,Client client) throws Exception;
    boolean delete(Long id) throws Exception;
}
