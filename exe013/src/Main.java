//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] estudantes = new String[] {"Maria", "Pedro", "João"};
        System.out.println("Exemplo com o loop for:");
        for (int i = 0; i < estudantes.length; i++) {
            System.out.println("Estudante: " + estudantes[i]);
        }
        System.out.println("\n\nExemplo com o loop foreach:");
        for (String estudante : estudantes) {
            System.out.println("Estudante: " + estudante);
        }
    }
}