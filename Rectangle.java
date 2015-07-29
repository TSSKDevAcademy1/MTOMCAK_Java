
public class Rectangle extends Shape {

	private int width;
	private int height;
	private boolean fault;
	private String rectangle;

	public Rectangle(int width, int height, int x, int y, char fill) {
		super(x, y, fill);

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
			String pom = "";
			for (int j = 0; j < getY(); j++) {
				System.out.println();
			}
			for (int k = 0; k < getX(); k++) {
				pom += ' ';
			}

			for (int i = 0; i < height; i++) {
				rectangle += pom;
				;
				for (int j = 0; j < width; j++) {
					rectangle += getFill();
				}
				rectangle += "\n";
			}
		}
		// TODO Auto-generated method stub
		return rectangle;
	}
}