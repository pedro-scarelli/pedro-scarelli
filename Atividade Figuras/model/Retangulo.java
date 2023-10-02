/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10.Q1.model;

/**
 *
 * @author Pedro Scarelli
 */
public class Retangulo extends Figura {

    private int altura;
    private int largura;

    public Retangulo(int largura, int altura) {
        this.altura = altura;
        this.largura = largura;
    }

   @Override
    public double calcularArea() {

        double area = altura * largura;

        return area;
    }
}
