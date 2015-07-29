public class Square {
	private int size;
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		
		if (size > 0) this.size = size;
		

	}

	private String square;
	private boolean fault;

	public Square(int size) {
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
		// TODO Auto-generated method stub
		if (fault) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					square += "*";
				}
				square +="\n";
			}
		}
		return square;
	}
}
