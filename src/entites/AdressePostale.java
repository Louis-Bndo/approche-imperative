package entites;

public class AdressePostale {

    public int num_rue;
    public String libelle_rue;
    public int cp;
    public String ville;

    //ajout tp2
    public AdressePostale(int num_rue, String libelle_rue, int cp, String ville){
        this.num_rue = num_rue;
        this.libelle_rue = libelle_rue;
        this.cp = cp;
        this.ville = ville;
    }



    public AdressePostale(){
        num_rue = 80;
        libelle_rue= "rue maréchal";
        cp=85000;
        ville= "la Roche sur Yon";
    }


}

