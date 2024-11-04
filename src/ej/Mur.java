package ej;

public class Mur extends Bloc {
    private boolean porteur;

    public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
        this.couleur = Couleur.GRIS;
    }

    public void afficher() {
        System.out.println(
                super.longueur + " " + super.largeur + " " + super.hauteur + " " + super.couleur + " " + this.porteur);
    }

    public boolean estTraversable() {
        return !this.porteur;
    }
}