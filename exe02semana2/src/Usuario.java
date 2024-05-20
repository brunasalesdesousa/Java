//Modifique o exercício anterior para que ele contenha dois métodos (um para mostrar na tela o nome e e-mail do usuário,
// e outro para verificar se uma determinada senha informada é igual à senha cadastrada pelo usuário).
// Além disso, inclua um método construtor para aceitar três parâmetros: o e-mail, a senha e o nome do usuário.

public class Usuario {
    // Atributos da classe
    String nome;
    String email;
    String senha;

    // Método construtor
    Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Método para imprimir as informações do usuário
    void imprimirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }

    // Método para verificar se uma senha fornecida é a senha correta do usuário
    boolean verificarSenha(String senhaFornecida) {
        return this.senha.equals(senhaFornecida);
    }

    // Método principal
    public static void main(String[] args) {

    }
}
