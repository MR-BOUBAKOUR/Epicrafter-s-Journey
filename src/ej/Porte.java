package ej;

public class Porte extends Bloc {
    private boolean verouille;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verouille) {
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
        this.couleur = Couleur.BLEU;
    }

    public void afficher() {
        System.out.println(super.longueur + " " + super.largeur + " " + super.hauteur + " " + super.couleur + " "
                + this.verouille);
    }

    public boolean estVerrouilee() {
        return this.verouille;
    }
}