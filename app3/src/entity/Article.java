package entity;

public class Article {
    protected int id;         // ID de l'article
    protected String lib;     // Libellé de l'article

    // Constructeurs
    public Article() {}

    public Article(int id, String lib) {
        this.id = id;
        this.lib = lib;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
}
