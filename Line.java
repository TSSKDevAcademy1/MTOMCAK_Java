public class Line extends Shape {
	private int length;
	private boolean vertical;
	private String line;

	public Line(int length, boolean vertical, int x, int y, char fill) {
		super(x, y, fill);
		line = "";
		this.length = length;
		this.vertical = vertical;

	}

	public int getLength() {
		return length;
	}

	// set length of vertical and horizontal length
	public boolean setLength(int length) {
		if (length > 0) {
			this.length = length;
			return true;
		}
		return false;
	}

	public boolean getVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		for (int j = 0; j < getY(); j++) {
			System.out.println();
			for (int k = 0; k < getX(); k++)
			{
				System.out.print(' ');
			}
		}
		
		for (int i = 0; i <= length; i++) {	
			line += getFill();
			if (vertical) {
				line += "\n";
			}
		}
		
		return line;
	}
}