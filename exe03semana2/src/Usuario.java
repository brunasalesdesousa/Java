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
        // Criação de uma instância de Usuario
        Usuario usuario = new Usuario("João", "joao@exemplo.com", "senhaSegura123");

        // Impressão das informações do usuário
        usuario.imprimirInfo();

        // Verificação da senha
        boolean senhaCorreta = usuario.verificarSenha("senhaSegura123");
        System.out.println("Senha fornecida está correta? " + senhaCorreta);

        boolean senhaIncorreta = usuario.verificarSenha("senhaSegura000");
        System.out.println("Senha fornecida está correta? " + senhaIncorreta);
    }
}
