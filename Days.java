package Cvicenie;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DayInt(Integer.parseInt(args[0]));

		} catch (NumberFormatException ex) {
			DayString(args[0]);
		}
	}

	private static void DayInt(int day) {
		switch (day) {
		case 1:
			System.out.println("Pondelisko");
			break;
		case 2:
			System.out.println("Utorisko");
			break;
		case 3:
			System.out.println("Streda");
			break;
		case 4:
			System.out.println("Stvrtok");
			break;
		case 5:
			System.out.println("Piatocek");
			break;
		case 6:
			System.out.println("Soboticka");
			break;
		case 7:
			System.out.println("Nedelicka");
			break;
		default:
			System.out.println("Out of range !");
		}
	}

	private static void DayString(String day) {
		day = day.toUpperCase();

		switch (day) {
		case "PONDELOK":
			System.out.println("Pondelisko");
			break;
		case "UTOROK":
			System.out.println("Utorisko");
			break;
		case "STREDA":
			System.out.println("Streda");
			break;
		case "STVRTOK":
			System.out.println("Stvrtok");
			break;
		case "PIATOK":
			System.out.println("Piatocek");
			break;
		case "SOBOTA":
			System.out.println("Soboticka");
			break;
		case "NEDELA":
			System.out.println("Nedelicka");
			break;
		default:
			System.out.println("Out of range !");
		}
	}

}
