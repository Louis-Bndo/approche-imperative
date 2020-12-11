package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main (String[] args) {
        AdressePostale ap;
        ap = new AdressePostale();
        System.out.println(ap.num_rue);
        System.out.println(ap.libelle_rue);
        System.out.println(ap.cp);
        System.out.println(ap.ville);
        /*AdressePostale ap2;
        System.out.println(ap2.num_rue);
        System.out.println(ap2.libelle_rue);
        System.out.println(ap2.cp);
        System.out.println(ap2.ville);*/

        //ajout tp2
        ap = new AdressePostale(ap.num_rue, ap.libelle_rue, ap.cp, ap.ville);
    }
}
