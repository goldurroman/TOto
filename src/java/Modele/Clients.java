package Modele;
// Generated 2018-09-03 11:44:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Clients generated by hbm2java
 */
public class Clients  implements java.io.Serializable {


     private String email;
     private String titre;
     private String nom;
     private String prenom;
     private String mdp;
     private Date dateInscription;
     private Set commandeses = new HashSet(0);

    public Clients() {
    }

	
    public Clients(String email, String titre, String nom, String prenom, String mdp, Date dateInscription) {
        this.email = email;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.dateInscription = dateInscription;
    }
    public Clients(String email, String titre, String nom, String prenom, String mdp, Date dateInscription, Set commandeses) {
       this.email = email;
       this.titre = titre;
       this.nom = nom;
       this.prenom = prenom;
       this.mdp = mdp;
       this.dateInscription = dateInscription;
       this.commandeses = commandeses;
    }
   
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getMdp() {
        return this.mdp;
    }
    
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public Date getDateInscription() {
        return this.dateInscription;
    }
    
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
    public Set getCommandeses() {
        return this.commandeses;
    }
    
    public void setCommandeses(Set commandeses) {
        this.commandeses = commandeses;
    }




}

