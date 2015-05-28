
public class ConwaysGameOfLife {

	private int _width;
	private int _height;
	private Cell [][] _grid;
	
	public ConwaysGameOfLife(int width, int height) {
		_width = width;
		_height = height;
		_grid = new Cell [_width][_height];
	}
	
	public int GetHeight()
	{
		return _height;
	}
	
	public int GetWidth()
	{
		return _width;
	}
	public Cell[][] GetGrid()
	{
		return _grid;
	}
	
	
  

}
