package services;

import dao.ClientDAO;
import entities.Client;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class ClientService {
    private ClientDAO clientDAO = new ClientDAO();

    public Client find(Integer id)
    {
        return clientDAO.findById(id);
    }
    public void save(Client client)
    {
        clientDAO.save(client);
    }
    public void update(Client client)
    {
        clientDAO.update(client);
    }
    public void delete(Client client)
    {
        clientDAO.delete(client);
    }
    public List<Client> findByFname(String surname, String name, String father)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("From Client where surname = '" + surname +"' and name = '" + name + "' and father = '"+father+"'").list();
    }
    public List<Client> findAll()
    {
        return clientDAO.findAll();
    }
}
