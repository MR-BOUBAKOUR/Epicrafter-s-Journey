package ej;

public class App {
    public static void main(String[] args) throws Exception {

        Mur Mur1 = new Mur(1, 2, 3, true);
        System.out.println("--------------- concernant le mur ---------------");
        Mur1.afficher();
        System.out.println(Mur1.estTraversable());

        Porte Porte1 = new Porte(4, 5, 6, false);
        System.out.println("--------------- concernant la porte ---------------");
        Porte1.afficher();
        System.out.println(Porte1.estVerrouilee());
    }
}
