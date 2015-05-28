
public class Cell {

	private boolean isAlive = false;
	public boolean getCellState()
	{	
		return isAlive;
	}
	public void setCellToAlive() {
		isAlive = true;
	}
	public void setCellToDead() {
		isAlive = false;
		
	}
	
	
	

}
