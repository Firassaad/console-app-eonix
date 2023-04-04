package Application.Entities;

import java.util.Arrays;
import java.util.List;
public class Singe {
    private static int count = 0;
    private final int id;
    private final List<Tour> tours;

    public Singe() {
        this.id = ++count;
        this.tours = Arrays.asList(
                new Tour("Acrobatie : marcher sur les mains", Tour.Type.ACROBATIE),
                new Tour("Acrobatie : rolade avant", Tour.Type.ACROBATIE),
                new Tour("Musique : jouer de la guitare", Tour.Type.MUSIQUE),
                new Tour("Musique : mimer des chanteurs sur l'écran", Tour.Type.MUSIQUE)
        );
    }

    public int getId() {
        return id;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void executerTour(Tour tour) {
        System.out.println("Le singe " + id + " exécute le tour " + tour.getNom());
    }
}

 class Tour {
    private final String nom;
    private final Type type;

    public Tour(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public Type getType() {
        return type;
    }

    enum Type {
        ACROBATIE,
        MUSIQUE
    }
}