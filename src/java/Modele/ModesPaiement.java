package Modele;
// Generated 2018-09-03 11:44:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ModesPaiement generated by hbm2java
 */
public class ModesPaiement  implements java.io.Serializable {


     private String idModesPaiement;
     private String nom;
     private Set commandeses = new HashSet(0);

    public ModesPaiement() {
    }

	
    public ModesPaiement(String idModesPaiement) {
        this.idModesPaiement = idModesPaiement;
    }
    public ModesPaiement(String idModesPaiement, String nom, Set commandeses) {
       this.idModesPaiement = idModesPaiement;
       this.nom = nom;
       this.commandeses = commandeses;
    }
   
    public String getIdModesPaiement() {
        return this.idModesPaiement;
    }
    
    public void setIdModesPaiement(String idModesPaiement) {
        this.idModesPaiement = idModesPaiement;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Set getCommandeses() {
        return this.commandeses;
    }
    
    public void setCommandeses(Set commandeses) {
        this.commandeses = commandeses;
    }




}

