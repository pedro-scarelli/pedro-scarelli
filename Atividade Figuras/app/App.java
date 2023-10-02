package L10.Q1.app;

import L10.Q1.model.Circulo;
import L10.Q1.model.Figura;
import L10.Q1.model.Quadrado;
import L10.Q1.model.Retangulo;
import L10.Q1.model.Triangulo;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raio = 0;
        int altura = 0;
        int largura = 0;
        int lado = 0;
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;

        System.out.println("Digite o tipo de figura geométrica: ");
        String tipoFigura = sc.next().toUpperCase();

        if (tipoFigura.equals("CIRCULO")) {
            System.out.println("Digite o raio do círculo: ");
            raio = sc.nextInt();
        } else if (tipoFigura.equals("RETANGULO")) {
            System.out.println("Digite a largura do retângulo: ");
            largura = sc.nextInt();
            System.out.println("Digite a altura do retângulo");
            altura = sc.nextInt();
        } else if (tipoFigura.equals("QUADRADO")) {
            System.out.println("Digite a medida do quadrado: ");
            lado = sc.nextInt();
        } else if (tipoFigura.equals("TRIANGULO")) {
            System.out.println("Digite o primeiro lado do triângulo: ");
            lado1 = sc.nextInt();

            System.out.println("Digite o segundo lado do triângulo: ");
            lado2 = sc.nextInt();

            System.out.println("Digite o terceiro lado do triângulo: ");
            lado3 = sc.nextInt();
        }

        if (tipoFigura.equals("CIRCULO")) {

            Figura C = new Circulo(raio);
            System.out.println("A área da figura é: " + C.calcularArea());

        } else if (tipoFigura.equals("RETANGULO")) {

            Figura R = new Retangulo(largura, altura);
            System.out.println("A área da figura é: " + R.calcularArea());

        } else if (tipoFigura.equals("QUADRADO")) {

            Figura Q = new Quadrado(lado);
            System.out.println("A área da figura é: " + Q.calcularArea());

        } else if (tipoFigura.equals("TRIANGULO")) {

            Figura T = new Triangulo(lado1, lado2, lado3);
            System.out.println("A área da figura é: " + T.calcularArea());

        }

        sc.close();
    }

}
