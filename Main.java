package exerciciocomswitchcase02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner hs = new Scanner(System.in);
		
		System.out.println(" Digite o número correspondente ao dia da semana: ");
		int x = hs.nextInt();
		String dia;
		
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}
		System.out.println("Dia da semana: " + dia );
		
		hs.close();

	}

}
