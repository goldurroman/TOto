/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import Modele.Ingredients;
import Modele.ProduitsIngredients;
import dao.IngredientDAO;
import dao.ProduitDAO;
import dao.ProduitIngredientDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 1895066
 */
public class IngredientService {
    
    private static IngredientDAO ingredientDao;
   private ProduitIngredientDAO produitIngredientDao;
    
    public IngredientService()
    {
    ingredientDao = new IngredientDAO();
    produitIngredientDao= new ProduitIngredientDAO();
    }
    
    public void save(Ingredients entity)
    {
        ingredientDao.openCurrentSessionwithTransaction();
        ingredientDao.persist(entity);
        ingredientDao.closeCurrentSessionwithTransaction();
    }
	public void update(Ingredients entity)
        {
        ingredientDao.openCurrentSessionwithTransaction();
        ingredientDao.update(entity);
        ingredientDao.closeCurrentSessionwithTransaction();
        }
        
	public Ingredients findById(String id)
        {
            ingredientDao.openCurrentSession();
            Ingredients artisan = ingredientDao.findById(id);
            ingredientDao.closeCurrentSession();
            return artisan;
        }
	public void delete(String id)
        {
            ingredientDao.openCurrentSessionwithTransaction();
            Ingredients artisan = ingredientDao.findById(id);
            ingredientDao.delete(artisan);
            ingredientDao.closeCurrentSessionwithTransaction();
        }
	public List<Ingredients> findAll()
        {
            ingredientDao.openCurrentSessionwithTransaction();
            List<Ingredients> list = ingredientDao.findAll();
            ingredientDao.closeCurrentSessionwithTransaction();
            return list;
        }
	public void deleteAll()
        {
        ingredientDao.openCurrentSessionwithTransaction();
        ingredientDao.deleteAll();
        ingredientDao.closeCurrentSessionwithTransaction();
        }
        
        
        
        public List<Ingredients> FindByProduct(String _codeProduit){
            produitIngredientDao.openCurrentSessionwithTransaction();
            List<ProduitsIngredients> list = produitIngredientDao.findingredientByproduct(_codeProduit);
          produitIngredientDao.closeCurrentSessionwithTransaction();   
            
            
         List<Ingredients> ingredients = new ArrayList<Ingredients>();   
        ingredientDao.openCurrentSessionwithTransaction();
        
        Iterator<ProduitsIngredients> itr = list.iterator();
      
      while(itr.hasNext()) {
         ProduitsIngredients element = itr.next();
          ingredients.add(ingredientDao.findById(element.getIdIngredient()));
         
      }
        
        ingredientDao.closeCurrentSessionwithTransaction();    
        return ingredients;
        }
    
}


