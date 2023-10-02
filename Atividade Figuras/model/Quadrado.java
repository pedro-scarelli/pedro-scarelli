package L10.Q1.model;

public class Quadrado extends Retangulo {   
    
    public Quadrado (int medida){
        super(medida, medida);// chamo o construtor da superclasse retangulo, pois quadrado é só um tipo de retangulo com os lados iguais
    }   
}
