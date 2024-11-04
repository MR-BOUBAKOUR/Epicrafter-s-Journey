package ej;

public class Porte extends Bloc {
    private boolean verouille;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verouille) {
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
        this.couleur = Couleur.BLEU;
    }

    public boolean estVerrouilee() {
        return this.verouille;
    }

    @Override
    public String toString() {
        return "Mur [longeur=" + longueur + ", largeur=" + largeur + ", hauteur=" + hauteur + ", porteur=" + verouille
                + "]";
    }
}