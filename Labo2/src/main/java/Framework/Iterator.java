package Framework;

/**
 *
 * interface permettant de verifier si il y a une suite
 *
 */
public interface Iterator {
    // indicates whether there are more elements to
    // iterate over
    boolean hasNext();

    // returns the next element
    Object next();
}
