package Framework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionDesTest {
    private CollectionDes collectionDes ;
    private De de1;
    private De de2;
    private De de3;
    private De de4;
    @BeforeEach
    public void faireAvant() {
        collectionDes = new CollectionDes();
        de1 = new De();
        de2 = new De();
    }
    @Test
    @DisplayName("ajouter un de valide")
    void ajouterDeValide() {
        assertTrue(collectionDes.ajouterDe(de1));
    }

    @Test
    @DisplayName("ajouter un de invalide")
    void ajouterDeInvalide() {
        de1 = null;
        assertFalse(collectionDes.ajouterDe(de1));
    }

    @Test
    @DisplayName("ajouter un de dans une liste remplie")
    void ajouterDeCollectionRempli() {
        collectionDes.ajouterDe(de1);
        collectionDes.ajouterDe(de2);
        collectionDes.ajouterDe(de3);

        assertFalse(collectionDes.ajouterDe(de4));
    }


}