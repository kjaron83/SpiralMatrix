/*
 * SpiralIterator.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */

package spiral;

import java.util.Iterator;

/**
 * This class iterates through a matrix spirally from the top-left corner clockwise direction.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
class SpiralIterator<T> implements Iterator<T> {

    private T next;
    private SpiralCursor<T> cursor;

    SpiralIterator(T[][] items) {
        cursor = new MovingRightCursor<>(items);
        next = cursor.getItem(0, 0);
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public T next() {
        T current = this.next;
        moveToNext();
        return current;
    }

    private void moveToNext() {
        next = cursor.getNext();
        if (next == null) {
            cursor = cursor.getNextCursor();
            next = cursor.getNext();
        }
    }    
    
}
