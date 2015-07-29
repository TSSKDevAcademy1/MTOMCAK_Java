
public class Triangle {
	private int size;
	String triangle = "";

	public int getSize() {
		return size;
	}

	// set size of triangle
	public boolean setSize(int size) {
		if (size < 0) {
			return false;
		}
		this.size = size;
		return true;
		
	}

	public Triangle(int size) {
		int i = 0;
		while (i < size) {
			triangle += printChars(size - i, ' ');
			triangle += printChars(2 * i + 1, '*');
			triangle += "\n";
			i++;
		}
	}

	private static final String printChars(int length, char c) {
		String line = "";
		for (int i = 0; i < length; i++) {
			line += c;
		}
		return line;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return triangle;
	}
}
