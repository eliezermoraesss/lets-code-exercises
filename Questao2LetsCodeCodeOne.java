import java.util.Scanner;

public class Questao2LetsCodeCodeOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");
        double temperaturaCelsius = scan.nextDouble();
        double temperaturaFahrenheit = conversorCelsiusFahrenheit(temperaturaCelsius);
        System.out.printf("O equivalente à %.1f °C é %.1f °F.", temperaturaCelsius, temperaturaFahrenheit);

        scan.close();
    }

    public static double conversorCelsiusFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * ((double) 9/5)) + 32;
    }
}
