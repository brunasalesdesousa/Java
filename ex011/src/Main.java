//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Exemplo de uso do break
        System.out.println("Exemplo com break:");
          for (int i = 1; i <= 5; i++) {
          if (i == 3) {
          break; // Encerra o loop quando i == 3
            }
            System.out.println("Número: " + i);
        }

        System.out.println();
         // Exemplo de uso do continue
        System.out.println("Exemplo com continue:");
           for (int i = 1; i <= 5; i++) {
           if (i == 3) {
           continue; // Pula para a próxima iteração quando i == 3
            }
        System.out.println("Número: " + i);

        }
    }
}