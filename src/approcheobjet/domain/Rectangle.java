package approcheobjet.domain;

public class Rectangle implements ObjetGeometrique {
    public int longueur;
    public int largeur;

    public Rectangle (int longueur, int largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (2*longueur) + (2*largeur);
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }
}
