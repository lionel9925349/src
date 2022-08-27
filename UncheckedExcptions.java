import java.util.ArrayList;

public class UncheckedExcptions {
	
	public static void main(String[] args) {
		
		// Exception (Fehler) -> Exception Handling -> try, catch
		// Es gibt in Java 2 Arten von Exception's (Fehlern)

		// Unchecked -> Das sind die fiesen Bugs!
		// Diese Fehler passieren zur Runtime (Laufzeit des Programmes)

		// ArrayIndexOutOfBoundsException
		String[] warenkorb = new String[40]; // Index 0 - 39

		warenkorb[0] = "Schuhe";
		warenkorb[1] = "Hemd";
		warenkorb[2] = "Gürtel";
		// ...
		// ...
		// ...
		// [39]
		
		try {
			warenkorb[40] = "Handy";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dein Warenkrob ist maximal gefüllt");
		}
		
		// NumberFormatException
		String inputTextField = "";
		inputTextField = "20";
		
		System.out.println(inputTextField + " Schuhe");
		
		int artikelPreis = 20;
		
		try {
			int gesamtSumme = artikelPreis * Integer.parseInt(inputTextField);
			System.out.println("Gesamtsumme: " + gesamtSumme);
		} catch (NumberFormatException e) {
			System.out.println("Bitte keine Buchstaben in das TextField eintippen");
		}
		
		// NullPointerException
		String passwort = null;
	
		try {
			if (passwort.length() <= 10) {
				System.out.println("Dein Passwort ist viel zu kurz");
			}
		} catch (Exception e) {
			System.out.println("Bitte ein Passwort eintippen");
		}
		
		// ClassCastException
		double number = 30.3456787654;
		int numberAsInt = (int)number;
		
		System.out.println(numberAsInt);
		
//		Object iObject = Integer.valueOf(42);
//		String string = (String)iObject;
		
		
		// Aus einem Golf ein Auto machen
		Auto meinAuto = new Auto(); 
		Golf golf = new Golf();
		
//		golf = (Golf)meinAuto;
		
		meinAuto = (Auto)golf;
		
		ArrayList list = new ArrayList();
		list.add("Brot");
		list.add("Tomaten");
		list.add(30);
		
//		for (Object object : list) {
//			String string = (String)object;
//			System.out.println(string);
//		}
		
	}

}

class Auto {
	
}

class Golf extends Auto {
	
}




















