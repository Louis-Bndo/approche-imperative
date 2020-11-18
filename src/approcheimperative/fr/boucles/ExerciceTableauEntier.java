package approcheimperative.fr.boucles;

public class ExerciceTableauEntier {

    public static void main ( String[] args ) {

        int [] monTableau = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("La première valeur est " +monTableau[0]);
        System.out.println("La taille du tableau est " +monTableau.length);
        System.out.println("Quatrième valeur du tableau avant modification "+monTableau[4]);
        monTableau[4]=8;
        System.out.println("Quatrième valeur du tableau après modification "+monTableau[4]);
    }
}
