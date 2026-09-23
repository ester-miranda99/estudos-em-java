package triangulo.entities;

// Essa classe é o "molde" do triângulo.
// Ela define o que todo triângulo vai ter (lados) e o que ele sabe fazer (calcular área).
public class Triangle {

    // Atributos: as características do triângulo (os 3 lados)
    public double a;
    public double b;
    public double c;

    // Método que calcula a área do próprio triângulo.
    // Coloquei a conta aqui dentro pra não ter que repetir a fórmula na Main toda vez que precisar calcular.
    public double area() {
        // 'p' é o semiperímetro (fórmula de Heron)
        double p = (a + b + c) / 2.0;
        
        // Retorna o resultado da área usando a raiz quadrada (Math.sqrt)
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}