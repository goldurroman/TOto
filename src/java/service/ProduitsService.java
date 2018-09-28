/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import Modele.Artisans;
import Modele.Produits;
import Modele.ProduitsIngredients;
import dao.ProduitDAO;
import dao.ProduitIngredientDAO;
import dao.ProduitsLanguesDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 1895066
 */
public class ProduitsService {
    
    private  ProduitDAO produitDao;
   private  ProduitIngredientDAO produitIngredientDao;
   public  static ProduitsLanguesDAO produitsLanguesDao;
   
    
    public ProduitsService()
    {
    produitDao = new ProduitDAO();
    produitIngredientDao= new ProduitIngredientDAO();
    }
    
    public void save(Produits entity)
    {
        produitDao.openCurrentSessionwithTransaction();
        produitDao.persist(entity);
        produitDao.closeCurrentSessionwithTransaction();
    }
	public void update(Produits entity)
        {
        produitDao.openCurrentSessionwithTransaction();
        produitDao.update(entity);
        produitDao.closeCurrentSessionwithTransaction();
        }
        
	public Produits findById(String id)
        {
            produitDao.openCurrentSession();
            Produits artisan = produitDao.findById(id);
            produitDao.closeCurrentSession();
            return artisan;
        }
	public void delete(String id)
        {
            produitDao.openCurrentSessionwithTransaction();
            Produits artisan = produitDao.findById(id);
            produitDao.delete(artisan);
            produitDao.closeCurrentSessionwithTransaction();
        }
	public List<Produits> findAll()
        {
            produitDao.openCurrentSessionwithTransaction();
            List<Produits> list = produitDao.findAll();
            produitDao.closeCurrentSessionwithTransaction();
            return list;
        }
	public void deleteAll()
        {
        produitDao.openCurrentSessionwithTransaction();
        produitDao.deleteAll();
        produitDao.closeCurrentSessionwithTransaction();
        }
        
        public List<Produits> FindByArtisans(String idArtisan){
        produitDao.openCurrentSessionwithTransaction();
        List<Produits> list = produitDao.FindByArtisans(idArtisan);
        produitDao.closeCurrentSessionwithTransaction();    
        return list;
        }
        
        public List<Produits> FindByIngredient(String idIngredient){
            produitIngredientDao.openCurrentSessionwithTransaction();
            List<ProduitsIngredients> list = produitIngredientDao.findproductByIngredient(idIngredient);
          produitIngredientDao.closeCurrentSessionwithTransaction();   
            
            
         List<Produits> produits = new ArrayList<Produits>();   
        produitDao.openCurrentSessionwithTransaction();
        Iterator<ProduitsIngredients> itr = list.iterator();
      
      while(itr.hasNext()) {
         ProduitsIngredients element = itr.next();
          produits.add(produitDao.findById(element.getCodeProduit()));
         
      }
        
        produitDao.closeCurrentSessionwithTransaction();    
        return produits;
        }

    public List<Produits> lastProducts() {
         produitDao.openCurrentSessionwithTransaction();
            List<Produits> list = produitDao.lastProduct();
            produitDao.closeCurrentSessionwithTransaction();
            return list;
    }
    
    public List<Produits> getProductsByCaracter(String caractereRecherche) {
         produitDao.openCurrentSessionwithTransaction();
            List<Produits> list = produitDao.getProductsByCaracter(caractereRecherche);
            produitDao.closeCurrentSessionwithTransaction();
            return list;
    }
    
    public List<Produits> last12Products() {
         produitDao.openCurrentSessionwithTransaction();
            List<Produits> list = produitDao.last12Product();
            produitDao.closeCurrentSessionwithTransaction();
            return list;
    }
    
    public List<Produits> getGroupProducts(int startIndex, int numberOfProducts){
    produitDao.openCurrentSessionwithTransaction();
    List<Produits> list = produitDao.getGroupProducts(startIndex, numberOfProducts);
    produitDao.closeCurrentSessionwithTransaction();
    return list;    
    }
    
    public List<Produits> getGroupProductsByArtisansId( String _artisan, int startIndex, int numberOfProducts){
    produitDao.openCurrentSessionwithTransaction();
            List<Produits> list = produitDao.getGroupProductsByArtisansId(_artisan, startIndex, numberOfProducts);
            produitDao.closeCurrentSessionwithTransaction();
            return list;
    }
}

