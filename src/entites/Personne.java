package entites;

import entites.AdressePostale;

public class Personne {
    public String nom, prenom;
    public AdressePostale app;

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale app){
        this.nom = nom;
        this.prenom = prenom;
        this.app = app;
    }

    public Personne(){
        nom = "Bernardeau";
        prenom = "Louis";
        app = new AdressePostale();;
    }

}
