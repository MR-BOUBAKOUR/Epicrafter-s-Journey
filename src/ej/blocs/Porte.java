package ej.blocs;

import ej.IllegalBlocException;
import ej.PorteVerrouilleException;

public class Porte extends Bloc {
    private boolean verouille;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verouille)
            throws IllegalBlocException {
        super(longueur, largeur, hauteur);
        this.verouille = verouille;
        this.couleur = Couleur.BLEU;
    }

    public boolean estVerrouilee() {
        return this.verouille;
    }

    public void verrouiller() throws PorteVerrouilleException {

        if (estVerrouilee()) {
            throw new PorteVerrouilleException(); // Lève l'exception si la porte est verrouillée
        } else {
            this.verouille = !verouille; // Inverse l'état de verrouillage si la porte n'est pas verrouillée
        }

    }

    @Override
    public String toString() {
        return "Porte [longeur=" + longueur + ", largeur=" + largeur + ", hauteur=" + hauteur + ", verouillée="
                + verouille
                + "]";
    }
}