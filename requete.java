import java.util.*;

public class requete {

    protected String nom;
    protected String desc;

    public requete(String nom, String description) {
        this.nom = nom;
        this.desc = description;
        Date date = new Date();
        String status = "en attente";

    }

    // deuxième constructeur car la description est optionnelle
    public requete(String nom) {
        this.nom = nom;
        Date date = new Date();
        String status = "en attente";

    }

    public requete getRequete() {
        return this;
    }

    public void setRequete() {
        // TO DO
    }

}