
public class HelloWorld {

	public static void main(String[] x) {
		/*
		// person
		System.out.println("Trieda Person");
		Person p = new Person("Janko Hrasko", 18);
		System.out.println(p);
		System.out.println();
		
		// Triangle
		Triangle t = new Triangle(3,5,5,'$');
		System.out.println(t);
		
		// new line
		System.out.println("Trieda Line");
		Line l = new Line(6, false, 3, 3, '~');
		System.out.println(l);
		
		String ps = "## ^__123__^ ##";
		System.out.println();
		*/
		// Square
		System.out.println("Trieda Square");
		Square s = new Square(5,3,3,'5',true);
		System.out.println(s);
		System.out.println();
		/*
		// Rectangle
		System.out.println("Trieda Rectangle");
		Rectangle r = new Rectangle(2,3,2,2,'$');
		System.out.println(r);
		System.out.println();
		System.out.println(ps);
		/*
		int lInOf,iOfFs;
		lInOf = ps.lastIndexOf("^");
		iOfFs = ps.indexOf("^");
		char s [];
		s = ps.toCharArray();
		for (int j = ++iOfFs; j < lInOf; j++)
		{
			s[j] = ' ';
		}
		
		ps = String.valueOf(s);
		System.out.println(ps);
		*/
	}

}
