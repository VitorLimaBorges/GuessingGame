import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        int numeroSecreto = new Random().nextInt(100) + 1;
        int palpite = 0;
        int tentativa = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(palpite != numeroSecreto && tentativa < 5) {

            IO.println("Digite seu palpite:");
            palpite = scanner.nextInt();
            tentativa++;

            if(palpite != numeroSecreto && tentativa == 5){
                IO.println("Você perdeu! O número secreto era: " + numeroSecreto);
                break;
            }

            if(palpite < numeroSecreto) {
                IO.println("O número secreto é maior!");
            } else if(palpite > numeroSecreto) {
                IO.println("O número secreto é menor!");
            }else {
                IO.println("Você acertou!");
                IO.println("Total de tentativas: " + tentativa);
            }
            
        }
    }
}
