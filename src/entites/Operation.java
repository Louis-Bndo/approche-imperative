package entites;

public abstract class Operation {
    String date;
    int montant;

    public Operation (String date, int montant){
        this.date = date;
        this.montant = montant;
    }

    public abstract String afficherType();
}
