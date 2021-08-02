package dao;

import entities.Address;
import entities.Contract;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AddressDAO {
    public Address findById(Integer id)
    {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Address.class, id);
    }
    public void save(Address address)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(address);
        transaction.commit();
        session.close();
    }
    public void update(Address address)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(address);
        transaction.commit();
        session.close();
    }
    public void delete(Address address)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(address);
        transaction.commit();
        session.close();
    }
    public List<Address> findAll()
    {
        return (List<Address>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Address ");
    }
}
