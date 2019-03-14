/*
 * MovingRightCursor.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */

package spiral;

/**
 * This class extends {@link SpiralCursor}.
 * This cursor moves rightward in the matrix.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
class MovingRightCursor<T> extends SpiralCursor<T> {        

    MovingRightCursor(T[][] items) {
        super(items);
    }        

    MovingRightCursor(T[][] items, int xFrom, int yFrom, int xTo, int yTo, int xPosition, int yPosition) {
        super(items, xFrom, yFrom, xTo, yTo, xPosition, yPosition);
    }

    @Override
    public SpiralCursor<T> getNextCursor() {
        return new MovingDownCursor<>(items, xFrom, yFrom + 1, xTo, yTo, xPosition, yPosition);
    }

    @Override
    public T getNext() {
        return getItem(xPosition + 1, yPosition);
    }

}
