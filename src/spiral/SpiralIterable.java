/*
 * SpiralIterable.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */

package spiral;

import java.util.Iterator;

/**
 * This class wraps a matrix and makes it iterable spirally.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public class SpiralIterable<T> implements Iterable<T> {

    private final T[][] items;
    
    public SpiralIterable(T[][] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> iterator() {
        return new SpiralIterator<>(items);
    }
    
}
