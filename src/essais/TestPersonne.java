package essais;


import entites.AdressePostale;
import entites.Personne;
import essais.TestAdressePostale;


public class TestPersonne {
    public static void main(String[] args) {
        Personne p, p1, p2;
        p = new Personne();
        /*System.out.println(p.nom);
        System.out.println(p.prenom);
        System.out.println(p.app);

        //ajout tp2
        p1 = new Personne(p.nom, p.prenom);
        System.out.println(p1.nom);
        System.out.println(p1.prenom);
        System.out.println(p1.app);

        p2 = new Personne(p.nom, p.prenom, p.app);
        System.out.println(p2.nom);
        System.out.println(p2.prenom);
        System.out.println(p2.app);*/


        //ajout tp3
        p.Majuscule(p.nom, p.prenom);

        //p.NouveauNom(p.nom);
        //p.NouveauPrenom(p.prenom);
        p.ReturnNom(p.nom);
        p.ReturnPrenom(p.prenom);
        p.ReturnAdresse(p.app);

    }
}
