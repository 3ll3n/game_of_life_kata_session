package org.conway;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by john on 23/06/17.
 */
public class CellTest {

    @Test
    public void DeadCell_WhenThreeNeighbours_AliveInNextGen(){
        Cell deadCell = new Cell(false);
        Cell nextGeneration = deadCell.tick(3);
        assertTrue(nextGeneration.isAlive());
    }

    @Test
    public void DeadCell_WhenTwoNeighbours_DeadInNextGen(){
        Cell deadCell = new Cell(false);
        Cell nextGeneration = deadCell.tick(2);
        assertFalse(nextGeneration.isAlive());
    }

    @Test
    public void LiveCell_WhenTwoNeighbours_AliveInNextGen(){
        Cell liveCell = new Cell(true);
        Cell nextGeneration = liveCell.tick(2);
        assertTrue(nextGeneration.isAlive());
    }

    @Test
    public void LiveCell_WhenOneNeighbour_DeadInNextGen(){
        Cell liveCell = new Cell(true);
        Cell nextGeneration = liveCell.tick(1);
        assertFalse(nextGeneration.isAlive());
    }

    @Test
    public void LiveCell_WhenMoreThanThreeNeighbours_DeadInNextGen(){
        Cell liveCell = new Cell(true);
        Cell nextGeneration = liveCell.tick(4);
        assertFalse(nextGeneration.isAlive());
    }
}
