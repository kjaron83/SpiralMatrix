/*
 * MovingUpCursor.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */

package spiral;

/**
 * This class extends {@link SpiralCursor}.
 * This cursor moves upward in the matrix.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
class MovingUpCursor<T> extends SpiralCursor<T> {        

    MovingUpCursor(T[][] items) {
        super(items);
    }        

    MovingUpCursor(T[][] items, int xFrom, int yFrom, int xTo, int yTo, int xPosition, int yPosition) {
        super(items, xFrom, yFrom, xTo, yTo, xPosition, yPosition);
    }

    @Override
    public SpiralCursor<T> getNextCursor() {
        return new MovingRightCursor<>(items, xFrom + 1, yFrom, xTo, yTo, xPosition, yPosition);
    }

    @Override
    public T getNext() {
        return getItem(xPosition, yPosition - 1);
    }

}    
