package entity;

public class Produit {
    private String ref;       // Référence du produit
    private String libelle;   // Libellé du produit
    private double quantite;  // Quantité disponible
    private int prix;         // Prix unitaire

    // Constructeurs
    public Produit() {}

    public Produit(String ref, String libelle, double quantite, int prix) {
        this.ref = ref;
        this.libelle = libelle;
        this.quantite = quantite;
        this.prix = prix;
    }

    // Getters et Setters
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
