package entites;

public class Credit extends Operation {

    public Credit(String date, int montant) {
        super(date, montant);
    }

    @Override
    public String afficherType() {
        return "Credit";
    }

    public String toString() {
        return "Crédit : le " + this.date + ", avec un montant de " + this.montant + " " + afficherType();
    }

}
