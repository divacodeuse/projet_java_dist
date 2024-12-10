package entity;

import java.util.Scanner;

public class ProduitImpl implements IProduit {

    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);

        // Collecte des informations du produit
        System.out.print("Entrez la référence du produit : ");
        String ref = scanner.nextLine();

        System.out.print("Entrez le libellé du produit : ");
        String libelle = scanner.nextLine();

        System.out.print("Entrez la quantité disponible : ");
        double quantite = scanner.nextDouble();

        System.out.print("Entrez le prix unitaire : ");
        int prix = scanner.nextInt();

        // Création d'une instance de Produit avec les données saisies
        return new Produit(ref, libelle, quantite, prix);
    }

    public void affichage(Produit produit) {
        // Affichage des informations du produit
        System.out.println("=== Informations du produit ===");
        System.out.println("Référence : " + produit.getRef());
        System.out.println("Libellé : " + produit.getLibelle());
        System.out.println("Quantité : " + produit.getQuantite());
        System.out.println("Prix : " + produit.getPrix() + " FCFA");
    }
}
