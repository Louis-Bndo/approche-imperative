package essais;

import entites.Compte;
import entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte c = new Compte(1, 1000);
        CompteTaux ct = new CompteTaux(1, 1000, 45);

        int t[] = new int [2];
        //t[0] = c;
        //t[1] = ct;

        System.out.println(ct);
    }
}
