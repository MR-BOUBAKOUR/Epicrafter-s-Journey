package ej;

public class App {
    public static void main(String[] args) throws Exception {
        Bloc bloc1 = new Bloc(10, 15, 20);

        System.out.println(bloc1.getLongueur());
        System.out.println(bloc1.getLargeur());
        System.out.println(bloc1.getHauteur());
    }
}
