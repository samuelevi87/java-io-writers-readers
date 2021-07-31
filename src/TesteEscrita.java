import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("texto-ti.txt")));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("text-saida.txt")));
		
		bw.write("Great ability without discretion comes almost invariably to a tragic end.");
		bw.newLine();
		bw.newLine();
		bw.write("Why fear death? It is the most beautiful adventure in life.");
		
		
		bw.close();
	}

}
