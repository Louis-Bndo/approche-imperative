package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<String>();
        Collections.addAll(setString, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
        String plusGrand = Collections.max(setString);
        setString.remove(plusGrand);
        Iterator i=setString.iterator(); // on crée un Iterator pour parcourir notre HashSet
        while(i.hasNext()) // tant qu'on a un suivant
        {
            System.out.println(i.next()); // on affiche le suivant
        }
    }
}
