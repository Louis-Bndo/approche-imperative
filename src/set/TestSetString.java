package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<String>();
        Collections.addAll(setString, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

        String plusGrand = Collections.max(setString);
        setString.remove(plusGrand);
        System.out.println(setString);
    }
}
