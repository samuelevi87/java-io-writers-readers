import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("texto-ti.txt")));

		String line = br.readLine();

		while (Objects.nonNull(line)) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

}
