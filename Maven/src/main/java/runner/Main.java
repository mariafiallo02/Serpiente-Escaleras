package runner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("holaaaaaa");
        System.out.print("Primer numero: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Operacion (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Segundo numero: ");
        double secondNumber = scanner.nextDouble();

        double result;
        switch (operation) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("No se puede dividir entre cero.");
                    return;
                }
                result = firstNumber / secondNumber;
            }
            default -> {
                System.out.println("Operacion no valida.");
                return;
            }
        }

        System.out.println("Resultado: " + result);
    }
    // hols :( changos 
}
