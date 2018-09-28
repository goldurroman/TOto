
package dao;

import Modele.Artisans;
import dao.interfaces.DaoInterface;


import Modele.Produits;
import java.util.List;
import org.hibernate.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author 1895066
 */
public class ProduitDAO implements DaoInterface<Produits, String> {

    private Session currentSession;
    private Transaction currentTransaction;

    public ProduitDAO() {
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
    public void persist(Produits entity) {
        getCurrentSession().save(entity);
    }

    @Override
    public void update(Produits entity) {
        getCurrentSession().update(entity);
    }

    @Override
    public void delete(Produits entity) {
        getCurrentSession().delete(entity);
    }

    @Override
    public Produits findById(String id) {
         Produits produit = (Produits) getCurrentSession().get(Produits.class, id);
       return produit;
    }

    @Override
    public List<Produits> findAll() {
        List<Produits> list = (List<Produits>) getCurrentSession().createQuery("from Produits").list();
        return list;
    }

    @Override
    public void deleteAll() {
          List<Produits> list = findAll();
        for (Produits produit : list) {
            delete(produit);
        }
    }

    public List<Produits> FindByArtisans(String _idArtisan) {
        Query query= getCurrentSession().createQuery("from Produits where idArtisan=:id");
        query.setParameter("id",_idArtisan);
        List<Produits> list = query.list();
        return list;
    }

    public List<Produits> lastProduct() {
         List<Produits> list = (List<Produits>) getCurrentSession().createQuery("from Produits where (Select count(*) from Produits)-SUBSTRING (codeProduit ,4 , 3 )<8").list();
        return list;
    }
    
    public List<Produits> last12Product() {
         List<Produits> list = (List<Produits>) getCurrentSession().createQuery("from Produits where (Select count(*) from Produits)-SUBSTRING (codeProduit ,4 , 3 )<12").list();
        return list;
    }
    
    public List<Produits> getProductsByCaracter(String caractereRecherche) {
         Query query= getCurrentSession().createQuery("from Produits where lower(codeProduit) LIKE lower(:char)");
        query.setParameter("char","%"+caractereRecherche+"%");
        List<Produits> list = query.list();
        return list;
    }
    

    
     public List<Produits> getGroupProducts(int startIndex, int numberOfProducts) {
        Query query = getCurrentSession().createQuery("from Produits");
        query.setFirstResult(startIndex);
        query.setMaxResults(numberOfProducts);
        List<Produits> list = (List<Produits>)query.list();
        return list;
    }

     public List<Produits> getGroupProductsByArtisansId( String _artisan, int startIndex, int numberOfProducts) {
        
         
        Query query= getCurrentSession().createQuery("from Produits where idArtisan=:_artisan");
        
        query.setParameter("artisans",_artisan);        
//        query.setFirstResult(startIndex);
//        query.setMaxResults(numberOfProducts);
        
        List<Produits> list = (List<Produits>)query.list();
        
        return list;
    }
}


