package entity;

public class Montre extends Article {
    private String nature;    // Nature de la montre (ex. analogique, numérique)

    // Constructeurs
    public Montre() {}

    public Montre(int id, String lib, String nature) {
        super(id, lib);       // Appel au constructeur de Article
        this.nature = nature;
    }

    // Getter et Setter
    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
}
