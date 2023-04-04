package Application;

import Application.Entities.Dresseur;
import Application.Entities.Singe;
import Application.Entities.Spectateur;

public class Main {

public static void main(String[] args) {
    Spectateur spectateur = new Spectateur();
    Dresseur dresseur1 = new Dresseur(new Singe());
    Dresseur dresseur2 = new Dresseur(new Singe());

    dresseur1.demanderTours(spectateur);
    dresseur2.demanderTours(spectateur);
}



}