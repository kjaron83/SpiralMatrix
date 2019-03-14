/*
 * MovingLeftCursor.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */

package spiral;

/**
 * This class extends {@link SpiralCursor}.
 * This cursor moves leftward in the matrix.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
class MovingLeftCursor<T> extends SpiralCursor<T> {        

    MovingLeftCursor(T[][] items) {
        super(items);
    }        

    MovingLeftCursor(T[][] items, int xFrom, int yFrom, int xTo, int yTo, int xPosition, int yPosition) {
        super(items, xFrom, yFrom, xTo, yTo, xPosition, yPosition);
    }

    @Override
    public SpiralCursor<T> getNextCursor() {
        return new MovingUpCursor<>(items, xFrom, yFrom, xTo, yTo - 1, xPosition, yPosition);
    }

    @Override
    public T getNext() {
        return getItem(xPosition - 1, yPosition);
    }

}
