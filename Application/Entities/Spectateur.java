package Application.Entities;

public class Spectateur {
    String reaction ="";
    public String getReaction() {
        return reaction;
    }

    public Spectateur() {
    }

    public void applaudit(String tour, int singe) {
        this.reaction ="Spectateur applaudit pendant le tour d'acrobatie '" + tour + "' du singe " + singe;
        System.out.println(reaction);
    }

    public void siffle(String tour, int singe) {
        this.reaction="Spectateur siffle pendant le tour de musique '" + tour + "' du singe " + singe;

        System.out.println(reaction);
    }
    
}
