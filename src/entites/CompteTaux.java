package entites;

public class CompteTaux extends Compte{
    public int tauxR;

    public CompteTaux(int id, int solde, int tauxR) {
        super(id, solde);
        this.tauxR = tauxR;
    }

    public String toString() {
        super.toString();
        return "Compte numero " + this.id + ", avec un solde de " + this.solde + " et un taux de rémunération de " + this.tauxR;
    }
}
