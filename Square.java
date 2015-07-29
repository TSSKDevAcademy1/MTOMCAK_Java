public class Square extends Shape {
	
	private int size;
	private boolean filled;
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		
		if (size > 0) this.size = size;
		

	}

	private String square;
	private boolean fault;

	public Square(int size, int x, int y, char fill, boolean filled) {
		super(x, y, fill);
		this.filled = filled;
		this.size = size;
		square = "";

		if (size > 0) {
			fault = true;
		} else {
			fault = false;
		}
	}

	@Override
	public String toString() {
		String pom = "";
		int lInOf,iOfFs;
		char s [];
		
		// set Y - axis
		for (int j = 0; j < getY(); j++) {
			System.out.println();
		}

		// set X - axis
		for (int k = 1; k < getX(); k++)
		{
			pom += ' ';
		}
		// TODO Auto-generated method stub
		if (fault) {
			for (int i = 0; i < size; i++) {
				square += pom;
				for (int j = 0; j < size; j++) {
					square += getFill();
				}
				
				
				lInOf = square.lastIndexOf(getFill());
				iOfFs = square.indexOf(getFill());
				s = square.toCharArray();
				
				for (int j = ++iOfFs; j < lInOf; j++)
				{
					s[j] = ' ';
				}
				square = String.valueOf(s);
				square +="\n";
			}
		}
		return square;
	}
}
