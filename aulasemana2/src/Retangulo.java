public class Retangulo {
    // atributos
    float altura;
    float comprimento;

    // métodos
    Retangulo(float alturaInicial) {
        this.altura = alturaInicial;
        this.comprimento = 10.0f;
    }

    Retangulo (float alturaInicial, float comprimentoInicial ) {
        this.altura = alturaInicial;
        this.comprimento = comprimentoInicial;
    }
    float calcularPerimetro() {
        return (2 * altura) + (2 * comprimento);
         }
    float calcularArea() {
        return altura * comprimento;

    }

    // ponto de partida do nosso código
    public static void main(String[] args) {
        System.out.println("Bem-Vindo ao mundo dos retângulos!");

        Retangulo ret1 = new Retangulo(5.2f, 12.5f);
               System.out.println("Perimetro ret1: " + ret1.calcularPerimetro());

        Retangulo ret2 = new Retangulo(10.3f);
               System.out.println("Perimetro ret2: " + ret2.calcularPerimetro());

        Retangulo ret3 = new Retangulo(5.5f);
               System.out.println("Perimetro ret3: " + ret3.calcularPerimetro());
    }
}
