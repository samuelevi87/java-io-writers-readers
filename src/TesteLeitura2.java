

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
//			/**
//			 * Guarda cada linha do arquivo em um Array, separando os elementos pela ",".
//			 */
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
//			
//			String valor1 = linhaScanner.next();
//			Integer valor2 = linhaScanner.nextInt();
//			Integer valor3 = linhaScanner.nextInt();
//			String valor4 = linhaScanner.next();
//			Double valor5 = linhaScanner.nextDouble();
//			
//			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
//			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt","BR"), "%s - %04d-%08d, %20s: %08.2f %n", 
					tipoConta, agencia, numero, titular, saldo );
			
			linhaScanner.close();
//			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		scanner.close();
	}
}
