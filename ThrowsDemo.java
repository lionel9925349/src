import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// { throw } -> steht innerhalb der Klammer / schmeißt den Fehler

		// { } throws -> steht außerhalb der Klammer / gibt nur Bescheid, dass es einen
		// Fehler geben kann

		// checked -> Check mich on Ort und Stelle
		// unchecked -> wirft erst zur Laufzeit

		try {
			loadMessages();
		} catch (SQLException e) {
			System.out.println("Bitte WLAN einschalten...");
		}
		
		

	}

	public static void getConnection() throws SQLException {
		// Verbindung zu einer Datenbank aufbauen
		boolean isConnected = false;

		if (isConnected) {

		} else {
			throw new SQLException("Keine Internet Verbindung vorhanden, bitte prüfen");
		}

	}

	public static void loadMessages() throws SQLException {

		getConnection();

	}
}













