import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class KeywordFinally {
	
	
//	try
//	{
//    // Operationen die evtl. eine Exception schmeißen
//	}catch
//	{
//		// Handling exception
//	}finally
//	{
//		// Finale -> Alles was hier steht wird auf jeden Fall ausgführt, ob mit Fehler
//		// oder nicht
//	}

	public static void main(String[] args) {


		try {
			int num = 121 / 3;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("Durch 0 teilen geht nicht");
		} finally {
			System.out.println("Finale");
		}
		
		myMethod();
	}
	
	// try, catch, finally und return
	public static int myMethod() {
		try {
			return 112;
		} finally {
			System.out.println("Ich bin der Finally block");
			System.out.println("Ich werde auch nach dem return von try block ausgeführt");
		}
	}
	
	public void readFile(String path) {
		File file = new File(path);
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			
			while(fileInputStream.read() != - 1) {
				System.out.println(fileInputStream.read());
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				
			}	
		}
	}
	

}
















