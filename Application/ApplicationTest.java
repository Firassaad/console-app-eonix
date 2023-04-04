package Application;

import org.junit.jupiter.api.Test;

import Application.Entities.Dresseur;
import Application.Entities.Singe;
import Application.Entities.Spectateur;

@Test
public class ApplicationTest {
        Spectateur spectateur = new Spectateur("Spectateur");
        Dresseur dresseur1 = new Dresseur("Dresseur 1");
        Dresseur dresseur2 = new Dresseur("Dresseur 2");
        Singe singe1 = new Singe("Singe 1", new Tour[] { new Tour("Acrobatie : marcher sur les mains",Type.ACROBATIE), 
                                                         new Tour("Musique : jouer de la guitare", Type.MUSIQUE) });
        Singe singe2 = new Singe("Singe 2", new Tour[] { new Tour("Acrobatie : rolade avant",Type.ACROBATIE), 
                                                         new Tour("Musique : mimer des chanteurs sur l'écran", Type.MUSIQUE) });
 
 
     Dresseur dresseur1 = new Dresseur(singe1);
     Dresseur dresseur2 = new Dresseur(singe2);

    
        dresseur1.demanderTours(spectateur);
        dresseur2.demanderTours(spectateur);

        assertEquals("Spectateur applaudit pendant le tour d'acrobatie 'Acrobatie : marcher sur les mains' du singe 1'\n" +
                     "Spectateur siffle pendant le tour de musique 'Musique : jouer de la guitare' du singe 1'\n" +
                     "Spectateur applaudit pendant le tour d'acrobatie 'Acrobatie : marcher sur les mains' du singe 2'\n" +
                     "Spectateur siffle pendant le tour de musique 'Musique : mimer des chanteurs sur l'écran' du singe 'Singe 2'\n", 
                     spectateur.getReaction());
}

