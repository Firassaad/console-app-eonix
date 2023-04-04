package Application.Entities;

public class Dresseur {
    private final Singe singe;

    public Dresseur(Singe singe) {
        this.singe = singe;
    }

    public void demanderTours(Spectateur spectateur) {
        for (Tour tour : singe.getTours()) {
            if (tour.getType() == Tour.Type.ACROBATIE) {
                spectateur.applaudit(tour.getNom(), singe.getId());
            } else {
                spectateur.siffle(tour.getNom(), singe.getId());
            }
            singe.executerTour(tour);
        }
    }
    
}
