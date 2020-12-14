package essais;

import entites.Compte;
import entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte c = new Compte(1, 1000);
        CompteTaux ct = new CompteTaux(1, 1000, 45);

        Compte t[] = new Compte [2];
        t[0] = new Compte(1, 1000);;
        t[1] = new CompteTaux(1, 500, 45);

        for (int i = 0; i < 2; i++) {
            System.out.println(t[i]);
        }
        //System.out.println(ct);
    }
}
