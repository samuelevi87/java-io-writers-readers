import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("texto-ti.txt")));
		
		String line = br.readLine();
		
		System.out.println(line);
		
		br.close();
	}

}