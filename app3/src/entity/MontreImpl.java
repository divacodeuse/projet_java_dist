package entity;

import java.util.Scanner;

public class MontreImpl implements IMontre {

    @Override
    public Montre saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'ID de la montre : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consommer le saut de ligne

        System.out.print("Entrez le libellé de la montre : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez la nature de la montre : ");
        String nature = scanner.nextLine();

        return new Montre(id, lib, nature);
    }

    @Override
    public void affichage(Montre m) {
        System.out.println("=== Informations de la montre ===");
        System.out.println("ID : " + m.getId());
        System.out.println("Libellé : " + m.getLib());
        System.out.println("Nature : " + m.getNature());
    }
}
