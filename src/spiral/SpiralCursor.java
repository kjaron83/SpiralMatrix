/*
 * SpiralCursor.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */

package spiral;

/**
 * The cursor goes through the elements of the matrix in one direction.
 * If it reaches the end returns another cursor to the next direction.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
abstract class SpiralCursor<T> {

    final T[][] items;
    final int xFrom;
    final int yFrom;
    final int xTo;
    final int yTo;

    int xPosition;
    int yPosition;

    SpiralCursor(T[][] items) {
        this.items = items;
        this.xFrom = 0;
        this.yFrom = 0;
        this.yTo = items.length - 1;
        this.xTo = yTo > -1 ? items[0].length - 1 : -1;
        this.xPosition = 0;
        this.yPosition = 0;            
    }

    SpiralCursor(T[][] items, int xFrom, int yFrom, int xTo, int yTo, int xPosition, int yPosition) {
        this.items = items;
        this.xFrom = xFrom;
        this.xTo = xTo;
        this.yFrom = yFrom;
        this.yTo = yTo;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    boolean isInside(int x, int y) {
        return x >= xFrom && x <= xTo && y >= yFrom && y <= yTo;
    }

    public T getItem(int x, int y) {
        if ( isInside(x, y) ) {
            xPosition = x;
            yPosition = y;
            return this.items[yPosition][xPosition];
        }
        return null;
    }

    public abstract SpiralCursor<T> getNextCursor();

    public abstract T getNext();
            
}
