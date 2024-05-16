//  Crie um algoritmo em Java que solicita três números decimais ao usuário.
//  Em seguida, a média destes números é calculada e mostrada na tela para o usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();
        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média é: " + media);
        scanner.close();
    }
}

