package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> listeString = new ArrayList<String>();
        Collections.addAll(listeString, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
        System.out.println(Collections.max(listeString));
        String majusculeListe = Collections.min(listeString);
        listeString.remove(majusculeListe);
        /*for (String n : listeString) {
            if (listeString.indexOf(1).equals("N") {
                listeString.remove;
            }
        }*/
        System.out.println(listeString);
    }
}
