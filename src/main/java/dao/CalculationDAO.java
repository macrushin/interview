package dao;

import entities.Calculation;
import entities.Contract;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class CalculationDAO {
    public Calculation findById(Integer id)
    {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Calculation.class, id);
    }
    public void save(Calculation calculation)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(calculation);
        transaction.commit();
        session.close();
    }
    public void update(Calculation calculation)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(calculation);
        transaction.commit();
        session.close();
    }
    public void delete(Calculation calculation)
    {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(calculation);
        transaction.commit();
        session.close();
    }
    public List<Calculation> findAll()
    {
        return (List<Calculation>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Calculation ");
    }
}
