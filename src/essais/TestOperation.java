package essais;

import entites.Compte;
import entites.Operation;
import entites.Credit;
import entites.Debit;

public class TestOperation {
    public static void main(String[] args) {
        Operation t[] = new Operation[8];
        t[0] = new Credit("12/09/2020", 1000);
        t[1] = new Credit("12/10/2020", 500);
        t[2] = new Credit("12/11/2020", 2000);
        t[3] = new Credit("12/12/2020", 100);

        t[4] = new Debit("15/09/2020", 50);
        t[5] = new Debit("15/10/2020", 10);
        t[6] = new Debit("15/11/2020", 500);
        t[7] = new Debit("15/12/2020", 1000);

        for (int i = 0; i < 8; i++) {
            System.out.println(t[i]);
        }
        int calcul = 0;
        //int calcul = t[0] + t[1] + t[2] + t[3] - t[4] - t[5] - t[6] - t[7];
        System.out.println(" Le montant global de toutes les opérations est de : " + calcul);
    }
}

