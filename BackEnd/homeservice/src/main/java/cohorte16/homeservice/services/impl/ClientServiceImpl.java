package cohorte16.homeservice.services.impl;

import cohorte16.homeservice.models.Client;
import cohorte16.homeservice.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {


    @Override
    public Client save(Client client) throws Exception {
        return null;
    }

    @Override
    public Client findById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Client> findAll() throws Exception {
        return null;
    }

    @Override
    public Client update(Long id, Client client) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
