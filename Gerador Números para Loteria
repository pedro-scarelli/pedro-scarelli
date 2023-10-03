import java.util.Random;
import java.util.Scanner;

public class GeradorLoteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o maior número possível para esse jogo: ");
        int maiorNum = sc.nextInt();

        System.out.println("Digite a quantidade de números por jogo: ");
        int qtNumsJogo = sc.nextInt();

        for (int i = 0; i < qtNumsJogo; i++) {

            int numAleatorio = random.nextInt(maiorNum) + 1;
            System.out.print(numAleatorio + " ");

        }

        sc.close();
    }

}
