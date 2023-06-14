package conversortemperatura;

/**
 *
 * @author Jaqueline
 */
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor de Temperatura");
        System.out.println("------------------------");
        System.out.println("Opções disponíveis:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Selecione a opção desejada: ");
        
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit2 = scanner.nextDouble();
                double celsius2 = fahrenheitToCelsius(fahrenheit2);
                System.out.println("A temperatura em Celsius é: " + celsius2);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        
        scanner.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

