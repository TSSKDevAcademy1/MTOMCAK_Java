
public class HelloWorld {

	public static void main(String[] x) {
		
		// person
		System.out.println("Trieda Person");
		Person p = new Person("Janko Hrasko", 18);
		System.out.println(p);
		System.out.println();
		
		// Triangle
		Triangle t = new Triangle(5);
		System.out.println(t);
		
		// new line
		System.out.println("Trieda Line");
		Line l = new Line(5,false);
		System.out.println(l);
		System.out.println();
		
		// Square
		System.out.println("Trieda Square");
		Square s = new Square(5);
		System.out.println(s);
		System.out.println();
		
		// Rectangle
		System.out.println("Trieda Rectangle");
		Rectangle r = new Rectangle(2,3);
		System.out.println(r);
		System.out.println();
		
	}

}
