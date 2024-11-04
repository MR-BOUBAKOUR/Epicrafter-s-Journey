package ej;

public class Main {

    public static void main(String[] args) {

        try {
            Porte porte = new Porte(3, 2, 3, true);
            porte.verrouiller();
            System.out.println(porte);
        } catch (IllegalBlocException e) {
            System.out.println(e.getMessage());
        } catch (PorteVerrouilleException e) {
            System.out.println(e.getMessage());
        }

    }
}