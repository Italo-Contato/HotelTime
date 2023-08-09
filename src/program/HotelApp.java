package program;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Locale;
import java.util.Scanner;
import java.util.Timer;

public class HotelApp {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		char resposta;
		Float precoHora = null;
		Duration drt = null;

		do {
			System.out.print("Digite o dia da entrada: ");
			int diaEntrada = read.nextInt();
			System.out.print("Digite a hora da entrada: ");
			int horaEntrada = read.nextInt();
			LocalDateTime data1 = LocalDateTime.of(2000, 1, diaEntrada, horaEntrada, 0);

			System.out.print("Digite o dia da saida: ");
			int diaSaida = read.nextInt();
			System.out.print("digite a hora da saida: ");
			int horaSaida = read.nextInt();
			LocalDateTime data2 = LocalDateTime.of(2000, 1, diaSaida, horaSaida, 0);

			drt = Duration.between(data1, data2);

			System.out.print("Digite o preço da hora: ");
			precoHora = read.nextFloat();
			System.out.println("Confira os valores: ");
			System.out.println("Entrada: Dia " + data1.getDayOfYear() + " às " + data1.getHour() + "hrs");
			System.out.println("Saida: Dia " + data2.getDayOfYear() + " às " + data2.getHour() + "hrs");
			System.out.println("Os valores estão corretos? s/n");
			resposta = read.next().charAt(0);
		} while (resposta == 'n');
		System.out.println("Valor a ser pago: " + calcula(drt.toHours(), precoHora));
	}

	public static float calcula(Long duration, float valorHora) {
		float result = duration * valorHora;
		return result;
	}
}