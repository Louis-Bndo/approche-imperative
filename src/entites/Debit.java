package entites;

public class Debit extends Operation {

    public Debit(String date, int montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {
        return "Débit";
    }

    public String toString() {
        return "Débit : le " + this.date + ", avec un montant de " + this.montant + " " + afficherType();
    }
}
