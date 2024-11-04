package ej;

public class IllegalBlocException extends Exception {
    public IllegalBlocException(String message) {
        super(message); // Ce message sera affiché lorsqu'on imprime l'exception
    }
}