import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptions {
	
	public static void main(String[] args) {
		
		// Exception (Fehler)
		// Es gibt in Java 2 Arten von Exception's (Fehlern)

		// Checked -> "Hey checked mich an Ort und Stelle!"

		// SQLException
		
		try {
			Connection connection = DriverManager.getConnection("C:/Programme/Java");
		} catch (SQLException e) {
			System.out.println("Hey bitte Internet Kabel prüfen");
		}

		System.out.println("Programm läuft hier weiter");
		
		// FileNotFoundException
		File pdfFile = new File("C:/Dateien/pdfDatei123.pdf");
		
		try {
			FileInputStream stream = new FileInputStream(pdfFile);
			stream.read();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
		} catch (IOException e) {
			System.out.println("Datei kann nicht gelesen werden, weil keine Rechte bestehen");
			System.out.println("Datei mit Passwort geschützt");
		} 
		
		// IOException -> Checked Exception

		
	}

}
