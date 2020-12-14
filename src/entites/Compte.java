package entites;

public class Compte {
    public int id, solde;

    public Compte (int id, int solde){
        this.id = id;
        this.solde = solde;
    }

    public String toString() {
        return "Compte numero " + this.id + ", avec un solde de " + this.solde;
    }

}
