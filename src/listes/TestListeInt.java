package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> listeInt = new ArrayList<Integer>();
        Collections.addAll(listeInt, -1,5,7,3,-2,4,8,5);
        System.out.println(listeInt);
        System.out.println(listeInt.size());
        System.out.println(Collections.max(listeInt));
        Integer plusPetitElementList = Collections.min(listeInt);
        listeInt.remove(plusPetitElementList);
        for (Integer val : listeInt) {
            if (val < 0) {
                Integer valM = val * val;
                listeInt.set(listeInt.indexOf(val), valM);
            }
        }
        System.out.println(listeInt);
    }
}
