package program;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class HotelApp {
	public static void main(String[] argrs) {
		Scanner read = new Scanner(System.in);
		System.out.println("Preço da hora: ");
		float precoHora = read.nextFloat();
		System.out.println("Que horas o cliente entrou: ");
		int hr = read.nextInt();
		System.out.println("Que horas o cliente saiu: ");
		int hrSaida = read.nextInt();

		LocalTime horaEntrada = LocalTime.of(hr, 00);
		LocalTime horaSaida = LocalTime.of(hrSaida, 00);

		Duration d1 = Duration.between(horaEntrada, horaSaida);
		
		
		System.out.println("valor a ser pago: " + calcula(d1, precoHora));
	}
	
	public static float calcula(Duration d1, float preco) {
		return d1.toHours()*preco;
	}
}
