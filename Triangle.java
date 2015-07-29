
public class Triangle extends Shape {
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

	public Triangle(int size, int x, int y, char fill) {
		super(x, y, fill);
		this.size = size;

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
		String pom = "";
		for (int j = 0; j < getY(); j++) {
			System.out.println();

		}
		for (int k = 1; k < getX(); k++)
		{
			pom += ' ';
		}
		int i = 0;
		while (i < size) {

			triangle += printChars(size - i, ' ') + pom ;
			triangle += printChars(2 * i + 1, getFill());
			
			triangle += "\n";
			i++;
		}
		return triangle;
	}
}
