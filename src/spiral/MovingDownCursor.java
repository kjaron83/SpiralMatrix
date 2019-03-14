/*
 * MovingDownCursor.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */

package spiral;

/**
 * This class extends {@link SpiralCursor}.
 * This cursor moves downward in the matrix.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
class MovingDownCursor<T> extends SpiralCursor<T> {        

    MovingDownCursor(T[][] items) {
        super(items);
    }        

    MovingDownCursor(T[][] items, int xFrom, int yFrom, int xTo, int yTo, int xPosition, int yPosition) {
        super(items, xFrom, yFrom, xTo, yTo, xPosition, yPosition);
    }

    @Override
    public SpiralCursor<T> getNextCursor() {
        return new MovingLeftCursor<>(items, xFrom, yFrom, xTo - 1, yTo, xPosition, yPosition);
    }

    @Override
    public T getNext() {
        return getItem(xPosition, yPosition + 1);
    }

}
