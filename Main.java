import java.util.Scanner;
import java.util.Random;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Random random = new Random();

         System.out.println("###################JOGO DE ADIVINHAÇÃO###################");

         System.out.println("Digite a quantidade de chances desejadas: ");
         int quantidadechances = sc.nextInt();

         int resposta = random.nextInt(10) + 1;
         boolean acertou = false;

         for (int i = 0; i < quantidadechances; i++) {
             System.out.println("Digite um número: ");
             int numero = sc.nextInt();
             if (numero > resposta) {
                 System.out.println("Resposta é menor");
             } else if (numero < resposta) {
                 System.out.println("Resposta é maior");
             } else {
                 System.out.println("Você acertou!!!");
                 acertou = true;
                 break;
             }

             if (!acertou) {
                 System.out.println("Você perdeu!!!");
             }
         }
     }
}