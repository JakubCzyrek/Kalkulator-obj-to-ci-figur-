import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kalkulator objętości wybranej figury v1.0");
		Scanner input = new Scanner(System.in);
		double option = 0;
		do {
			System.out.println("=========================================");
			System.out.println();
			System.out.println("1) △ Trójkąt");
			System.out.println("2) ▭ Prostokąt");
			System.out.println("3) □ Kwadrat");
			System.out.println("4) ◯ Okrąg");
			System.out.println("5) ↩ Wyjście");
			System.out.print("Wybierz figurę: ");
			option = input.nextInt();
			input.nextLine(); // Clear Keyboard
			if (option == 1) {
				System.out.println("Wybrałeś Trójkąt jako figurę do obliczenia objętości.");
				System.out.println("Teraz przejdź do wprowadzania danych");
				System.out.println("...");
				System.out.print("Wprowadź długość podstawy Trójkąta: ");
				double base = input.nextInt();
				System.out.print("Wprowadź wysokość Trójkąta: ");
				double Wysokość = input.nextInt();
				double pole = pole_Trójkąt(base, Wysokość);
				System.out.println("Na podstawie wprowadzonych wartości, Trójkąt ma powierzchnię " + pole);
			} else if (option == 2) {
				System.out.println("Wybrałeś Prostokąt jako figurę do obliczenia objętości.");
				System.out.println("Teraz przejdź do wprowadzania danych");
				System.out.println("...");
				System.out.print("Wprowadź długość Prostokąta: ");
				double długość = input.nextInt();
				System.out.print("Wprowadź szerokość Prostokąta: ");
				double szerokość = input.nextInt();
				double pole = pole_Prostokąt(długość, szerokość);
				System.out.println("Na podstawie wprowadzonych wartości, Prostokąt ma powierzchnię " + pole);
			} else if (option == 3) {
				System.out.println("Wybrałeś Kwadrat jako figurę do obliczenia objętości.");
				System.out.println("Teraz przejdź do wprowadzania danych");
				System.out.println("...");
				System.out.print("Wprowadź długość boku Kwadratu: ");
				double side = input.nextInt();
				double pole = pole_Kwadrat(side);
				System.out.println("Na podstawie wprowadzonych wartości, Kwadrat ma powierzchnię " + pole);
			} else if (option == 4) {
				System.out.println("Wybrałeś Okrąg jako figurę do obliczenia objętości.");
				System.out.println("Teraz przejdź do wprowadzania danych");
				System.out.println("...");
				System.out.print("Wprowadź promień okręgu: ");
				double radius = input.nextInt();
				double pole = pole_Okrąg(radius);
				System.out.println("Na podstawie wprowadzonych wartości, Okrąg ma powierzchnię " + pole);

			} else if (option != 5) {
				System.out.println("Koniec programu");
			}
		} while (option != 5);
		input.close();
	}

	private static double pole_Okrąg(double radius) {
		return Math.PI * (radius * radius);
	}

	private static double pole_Kwadrat(double side) {
		return side * side;
	}

	private static double pole_Prostokąt(double długość, double szerokość) {
		return długość * szerokość;
	}

	private static double pole_Trójkąt(double base, double Wysokość) {
		return .5 * base * Wysokość;
	}

}