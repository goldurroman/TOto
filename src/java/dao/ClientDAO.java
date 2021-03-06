/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modele.Clients;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import dao.interfaces.DaoInterface;


/**
 *
 * @author 1895066
 */
public class ClientDAO implements DaoInterface<Clients, String> {

    private Session currentSession;
    private Transaction currentTransaction;

    public ClientDAO() {
    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    @Override
    public List<Clients> findAll() {
        List<Clients> list = (List<Clients>) getCurrentSession().createQuery("from Clients").list();
        return list;
    }

    @Override
    public void deleteAll() {
        List<Clients> list = findAll();
        for (Clients client : list) {
            delete(client);
        }
    }

    

    @Override
    public void persist(Clients entity) {
        getCurrentSession().save(entity);
    }

    @Override
    public void update(Clients entity) {
         getCurrentSession().update(entity);
    }

    @Override
    public Clients findById(String id) {
        Clients client = (Clients) getCurrentSession().get(Clients.class, id);
        return client;
    }

    @Override
    public void delete(Clients entity) {
        getCurrentSession().delete(entity);
    }

}

