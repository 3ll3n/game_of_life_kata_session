package org.conway;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by john on 23/06/17.
 */
public class CellTest {

    @Test
    public void WhenCellCreatedIsValidObject(){
        Cell cell = new Cell();
        assertNotNull(cell);

    }

}
