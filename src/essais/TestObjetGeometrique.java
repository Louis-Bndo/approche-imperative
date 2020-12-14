package essais;

import approcheobjet.domain.ObjetGeometrique;
import approcheobjet.domain.Cercle;
import approcheobjet.domain.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique og[] = new ObjetGeometrique[2];
        og[0] = new Cercle(2);
        og[1] = new Rectangle(5, 10);

        for (int i = 0; i < 2; i++) {
            System.out.println("Le périmètre est de : " + og[i].perimetre() + "et la surface de " + og[i].surface());
        }
    }
}
