//Crie um algoritmo em Java que peça ao usuário a temperatura em graus Celsius
// e converta-a para graus Fahrenheit. Além disso, o programa deve imprimir se está frio (abaixo de 32°F),
// moderado (entre 32°F e 80°F) ou quente (acima de 80°F).

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();
        // Converte para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
        // Verifica e imprime se está frio, moderado ou quente
        if (fahrenheit < 32) {
            System.out.println("Está frio!");
        } else if (fahrenheit <= 80) {
            System.out.println("Está moderado!");
        } else {
            System.out.println("Está quente!");
        }        scanner.close();
    }
}