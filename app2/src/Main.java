
import entity.Produit;
import entity.ProduitImpl;

public class Main {
    public static void main(String[] args) {
        ProduitImpl produitImpl = new ProduitImpl();

        System.out.println("=== Saisie d'un produit ===");
        Produit produit = produitImpl.saisie(); // Saisie des informations du produit

        System.out.println("\n=== Affichage du produit ===");
        produitImpl.affichage(produit); // Affichage des informations du produit
    }
}
