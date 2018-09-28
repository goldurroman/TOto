/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import service.ArtisanService;
import service.ProduitsService;

/**
 *
 * @author 1895135
 */
public class Gestionnaire {
    private List<Produits> listeProduits;
    private ProduitsService ps;
    private ArtisanService as;
    
    public Gestionnaire(){   
        as = new ArtisanService();
        ps = new ProduitsService();
        listeProduits = new ArrayList<Produits>();
        listeProduits = ps.lastProducts();
    }

     public Artisans findArtisanById(String id){
     return as.findById(id);
     }
    public List<Produits> getListeProduits() {
        return listeProduits;
    }
    
    public List<Produits> findAll() {
        return ps.findAll();
    }
    
    public List<Produits> getProductsByCaracter(String caractereRecherche) {
        return ps.getProductsByCaracter(caractereRecherche);
    }
    
    public List<Produits> getListe12Produits() {
        return ps.last12Products();
    }
    
    public List<Produits> getListeProduitsByArtisansId(String id) {
        return ps.FindByArtisans(id);
    }
    
    public List<Produits>  getGroupProductsByArtisansId( String _artisan, int startIndex, int numberOfProducts){
        return ps.getGroupProductsByArtisansId(_artisan, startIndex, numberOfProducts);
    }
    
    public List<Produits> getGroupProducts(int startIndex, int numberOfProducts){
        return ps.getGroupProducts(startIndex, numberOfProducts);
    }

    public void setDetails(){
         Iterator<Produits> itr = listeProduits.iterator();
      
      while(itr.hasNext()) {
         Produits element = itr.next();
       // ps.produitsLanguesDao.findNameIngredientByIngredientAndLanguage("FR", element.getCodeProduit()).get(0).getNomProduit();
         //element.setName(ps.produitsLanguesDao.findNameIngredientByIngredientAndLanguage("FR", element.getCodeProduit()).get(0).getNomProduit());
         
      }
    
    }
    
}
