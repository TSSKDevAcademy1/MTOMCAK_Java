
public class Rectangle {

	private int width;
	private int height;
	private boolean fault;
	private String rectangle;

	public Rectangle(int width, int height) {
		rectangle = "";
		this.width = width;
		this.height = height;

		if (width > 0 && height > 0) {
			fault = true;
		} else {
			fault = false;
			System.out.println("incorrect input value !");
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width > 0)
			this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {

		// TODO Auto-generated method stub
		if (fault) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					rectangle += "*";
				}
				rectangle += "\n";
			}
		}

		// TODO Auto-generated method stub
		return rectangle;
	}

}
