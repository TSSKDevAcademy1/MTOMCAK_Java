
public class Line {
	private int length;
	private boolean vertical;
	private String line;

	public Line(int length, boolean vertical) {
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
		for (int i = 0; i < length; i++) {
			line += "*";
			if (vertical)
			{
				line += "\n";
			}
		}
		return line;
	}

}
