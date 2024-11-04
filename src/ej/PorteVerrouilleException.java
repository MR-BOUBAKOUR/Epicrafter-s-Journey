package ej;

public class PorteVerrouilleException extends Exception {

    private static final String DEFAULT_MESSAGE = "La porte est verrouillée.";

    public PorteVerrouilleException() {
        super(DEFAULT_MESSAGE); // Appelle le constructeur parent avec le message par défaut
    }
}