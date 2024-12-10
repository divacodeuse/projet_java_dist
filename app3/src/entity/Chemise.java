package entity;

public class Chemise extends Article {
    private String couture;   // Type de couture de la chemise

    // Constructeurs
    public Chemise() {}

    public Chemise(int id, String lib, String couture) {
        super(id, lib);       // Appel au constructeur de Article
        this.couture = couture;
    }

    // Getter et Setter
    public String getCouture() {
        return couture;
    }

    public void setCouture(String couture) {
        this.couture = couture;
    }
}
