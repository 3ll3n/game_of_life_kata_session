package org.conway;

/**
 * Created by john on 23/06/17.
 */
public class Cell {

    boolean alive;

    public Cell(boolean alive){
        this.alive = alive;
    }

    public Cell tick(int numberOfNeighbours) {
        Cell next = new Cell(this.alive);

        if (this.alive == false) {
            next.alive = (numberOfNeighbours == 3) ? true : false;
        }

        if (this.alive == true){
            next.alive = (numberOfNeighbours < 2 || numberOfNeighbours > 3) ? false : true;
        }

        return next;
    }

    public boolean isAlive() {
        return alive;
    }
}