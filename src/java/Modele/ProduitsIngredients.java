/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author 1895135
 */
public class ProduitsIngredients {
    private String codeProduit;
     private String idIngredient;
     
     public ProduitsIngredients(String _codeProduit, String _idIngredient){
         codeProduit=_codeProduit;
         idIngredient=_idIngredient;      
     }

    public String getCodeProduit() {
        return codeProduit;
    }

   

    public String getIdIngredient() {
        return idIngredient;
    }

    
}
