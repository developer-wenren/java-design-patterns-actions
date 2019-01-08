package patterns.behavior.iterator;

/**
 * @author One
 */
public interface Iterator<T> {
    /**
     * @return
     */
    T getNext();

    /**
     * @return
     */
   boolean isLast();
}