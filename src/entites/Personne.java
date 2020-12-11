package entites;
import java.util.Scanner;
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

    //ajout tp2
    public Personne(){
        nom = "Bernardeau";
        prenom = "Louis";
        app = new AdressePostale();;
    }

    //ajout tp3 -> adresse ne fonctionne pas
    public static void Majuscule(String nom, String prenom){
        nom = nom.toUpperCase();
        System.out.println(nom + " " + prenom);
    }

    public void NouveauNom(String nom){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le nouveau nom : ");
        nom = input.nextLine();
        Majuscule(nom, prenom);
    }

    public void NouveauPrenom(String prenom){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le nouveau prenom : ");
        prenom = input.nextLine();
        Majuscule(nom, prenom);
    }
/*
    public void NouvelleAdresse(AdressePostale app){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez la nouvelle Adresse : ");
        app = input.next();
    }*/

    public static void ReturnNom(String nom){
        System.out.println(nom);
    }

    public static void ReturnPrenom(String prenom){
        System.out.println(prenom);
    }

    /*public static void ReturnAdresse(AdressePostale app){
        System.out.println(app);
    }*/
}
