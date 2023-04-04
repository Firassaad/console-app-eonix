package Application;

import org.junit.jupiter.api.Test;

import Application.Entities.Dresseur;
import Application.Entities.Singe;
import Application.Entities.Spectateur;

@Test
public class ApplicationTest {
        Spectateur spectateur = new Spectateur("Spectateur 1");
        Dresseur dresseur1 = new Dresseur("Dresseur 1");
        Dresseur dresseur2 = new Dresseur("Dresseur 2");
        Singe singe1 = new Singe("Singe 1", new Tour[] { new TourAcrobatie("Tour acrobatie 1"), new TourMusique("Tour musique 1") });
        Singe singe2 = new Singe("Singe 2", new Tour[] { new TourAcrobatie("Tour acrobatie 2"), new TourMusique("Tour musique 2") });

        dresseur1.faireExecuterTousLesTours(singe1, spectateur);
        dresseur2.faireExecuterTousLesTours(singe2, spectateur);

        assertEquals("Spectateur 1 applaudit pendant le tour d'acrobatie 'Tour acrobatie 1' du singe 'Singe 1'\n" +
                     "Spectateur 1 siffle pendant le tour de musique 'Tour musique 1' du singe 'Singe 1'\n" +
                     "Spectateur 1 applaudit pendant le tour d'acrobatie 'Tour acrobatie 2' du singe 'Singe 2'\n" +
                     "Spectateur 1 siffle pendant le tour de musique 'Tour musique 2' du singe 'Singe 2'\n", 
                     spectateur.getReaction());
    }
}
