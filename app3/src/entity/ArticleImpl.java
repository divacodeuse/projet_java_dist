package entity;

import java.util.Scanner;

public class ArticleImpl implements IArticle {

    @Override
    public Article saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'ID de l'article : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consommer le saut de ligne

        System.out.print("Entrez le libellé de l'article : ");
        String lib = scanner.nextLine();

        return new Article(id, lib);
    }

    @Override
    public void affichage(Article a) {
        System.out.println("=== Informations de l'article ===");
        System.out.println("ID : " + a.getId());
        System.out.println("Libellé : " + a.getLib());
    }
}
