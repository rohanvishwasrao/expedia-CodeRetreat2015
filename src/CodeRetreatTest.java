import static org.junit.Assert.*;

import org.junit.Test;


public class CodeRetreatTest {

	@Test
	public void testIfCellIsAlive() {
		Cell cell = new Cell();
		cell.setCellToAlive();
		boolean isAlive = true;
		//assertTrue(cell.getCellState(),,);
		assertTrue("Cell was dead", cell.getCellState() == isAlive);
	}
	
	@Test
	public void testIfCellIsDead() {
		Cell cell = new Cell();
		cell.setCellToDead();
		boolean isAlive = false;
		//assertTrue(cell.getCellState(),,);
		assertTrue("Cell was alive", cell.getCellState() == isAlive);
	}
	
	@Test
	public void testIfGameHeight() {
		int width = 50;
		int height = 50;
		ConwaysGameOfLife mygame = new ConwaysGameOfLife(width, height);
		assertTrue("height is not greater than 0", mygame.GetHeight() > 0);
		
	}

	@Test
	public void testIfGameWidth() {
		int width = 50;
		int height = 50;
		ConwaysGameOfLife mygame = new ConwaysGameOfLife(width, height);
		assertTrue("Width is not greater than 0", mygame.GetWidth() > 0);
	}
	
	@Test
	public void testIfTheGridIsCreated()
	{
		
	}
}
