import java.util.Scanner;

public class TryCatchVerschachtelung {

	public static void main(String[] args) {

		try {
			System.out.println("Bitte Anzahl der Hemden eingeben...");
			Scanner scanner = new Scanner(System.in);
			String textString = scanner.nextLine();

			int gesamtKosten = Integer.valueOf(textString);
			System.out.println("Deine Kosten: " + gesamtKosten * 10 + " €");
		} catch (NumberFormatException e) {
			System.out.println("Bitte nur Zahlen zwischen 1-10 eintippen");

			try {
				System.out.println("Bitte Anzahl der Hemden eingeben...");
				Scanner scanner = new Scanner(System.in);
				String textString = scanner.nextLine();

				int gesamtKosten = Integer.valueOf(textString);
				System.out.println("Deine Kosten: " + gesamtKosten * 10 + " €");
			} catch (NumberFormatException e2) {
				System.out.println("Bitte nur Zahlen zwischen 1-10 eintippen");

				try {
					System.out.println("Bitte Anzahl der Hemden eingeben...");
					Scanner scanner = new Scanner(System.in);
					String textString = scanner.nextLine();

					int gesamtKosten = Integer.valueOf(textString);
					System.out.println("Deine Kosten: " + gesamtKosten * 10 + " €");
				} catch (NumberFormatException e3) {
					System.out.println("Bitte nur Zahlen zwischen 1-10 eintippen");
				}

			}

		}
	}

}
