package Framework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionJoueursTest {
    private CollectionJoueurs collectionJoueurs ;
    private Joueur joueur1;
    private Joueur joueur2;
    private Joueur joueur3 ;
    private Joueur joueur4 ;

    @BeforeEach
    public void faireAvant() {
        collectionJoueurs = new CollectionJoueurs(3);
         joueur1 = new Joueur("joueur 1");
         joueur2 = new Joueur("joueur 2");
         joueur3 = new Joueur("joueur 3");
         joueur4 = new Joueur("joueur 4");
    }
        @Test
    @DisplayName("ajouter un joueur valide")
    void ajouterJoueurValide() {
        Joueur joueur = new Joueur("joueur 1");
        assertTrue(collectionJoueurs.ajouterJoueur(joueur));
    }
    @Test
    @DisplayName("ajouter un joueur invalide")
    void ajouterJoueurInvalide() {
        Joueur joueur = null;
        assertFalse(collectionJoueurs.ajouterJoueur(joueur));

    }

    @Test
    @DisplayName("ajouter un joueur lorsque la collection est rempli")
    void ajouterJoueurCollectionRempli() {

        collectionJoueurs.ajouterJoueur(joueur1);
        collectionJoueurs.ajouterJoueur(joueur2);
        collectionJoueurs.ajouterJoueur(joueur3);

        assertFalse(collectionJoueurs.ajouterJoueur(joueur4));

    }


    @Test
    @DisplayName("recherche un joueur existant dans la liste")
    void containsJoueurExistant() {
        collectionJoueurs.ajouterJoueur(joueur1);
        collectionJoueurs.ajouterJoueur(joueur2);

        assertTrue(collectionJoueurs.contains(joueur2));
    }

    @Test
    @DisplayName("recherche un joueur non existant dans la liste")
    void containsJoueurNonExistant() {
        collectionJoueurs.ajouterJoueur(joueur1);
        collectionJoueurs.ajouterJoueur(joueur2);

        assertFalse(collectionJoueurs.contains(joueur3));
    }

}