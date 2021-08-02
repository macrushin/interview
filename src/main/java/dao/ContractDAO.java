package dao;

import entities.Contract;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class ContractDAO {
    public Contract findById(Integer id)
    {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Contract.class, id);
    }
    public void save(Contract contract)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(contract);
        transaction.commit();
        session.close();
    }
    public void update(Contract contract)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(contract);
        transaction.commit();
        session.close();
    }
    public void delete(Contract contract)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(contract);
        transaction.commit();
        session.close();
    }
    public List<Contract> findAll()
    {
        return (List<Contract>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Contract ");
    }
}
