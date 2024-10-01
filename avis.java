import java.util.*;

public class avis{

    protected int nbEtoiles;
    protected String desc;

    public avis(int nbEtoiles, String description) {
        Date date = new Date();
        this.nbEtoiles = nbEtoiles;
        this.desc = description;
        //user pourQui = ;
        //user deQui = ;
    }

    public avis(int nbEtoiles) {
        Date date = new Date();
        //user pourQui = ;
        //user deQui = ;
    }

    public void getAvis() {
        System.out.println("Nombre d'étoiles attribuées:" + this.nbEtoiles + " , Posté par : ");
    }

}
