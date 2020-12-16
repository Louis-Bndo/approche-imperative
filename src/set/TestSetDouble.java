package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {
        Set<Double> setDouble = new HashSet<Double>();
        Collections.addAll(setDouble,1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
        System.out.println(setDouble);
        System.out.println(Collections.max(setDouble));
        setDouble.remove(Collections.min(setDouble));
        System.out.println(setDouble);
    }
}
