
import entity.*;

public class Main {
    public static void main(String[] args) {
        // Test de Chemise
        ChemiseImpl chemiseImpl = new ChemiseImpl();
        System.out.println("=== Saisie d'une chemise ===");
        Chemise chemise = chemiseImpl.saisie();
        chemiseImpl.affichage(chemise);

        // Test de Montre
        MontreImpl montreImpl = new MontreImpl();
        System.out.println("\n=== Saisie d'une montre ===");
        Montre montre = montreImpl.saisie();
        montreImpl.affichage(montre);

        // Test de Article
        ArticleImpl articleImpl = new ArticleImpl();
        System.out.println("\n=== Saisie d'un article générique ===");
        Article article = articleImpl.saisie();
        articleImpl.affichage(article);
    }
}
