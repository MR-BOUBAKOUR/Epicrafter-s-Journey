package ej;

public class Porte extends Bloc {
    private boolean verouille;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verouille) {
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
    }

    public void afficher() {
        System.out.println(super.longueur + " " + super.largeur + " " + super.hauteur + " " + this.verouille);
    }

    public boolean estVerrouilee() {
        return this.verouille;
    }
}
