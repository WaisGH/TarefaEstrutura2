import java.util.Scanner;

public class Letram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palavra = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra #" + (i + 1) + ": ");
            palavra[i] = scanner.next();
        }

        System.out.print("Escreva a letra para substituir: ");
        char letra = scanner.next().charAt(0);
        
        int i;

        for (i = 0; i < 10; i++) {
            palavra[i] = palavra[i].replace(letra, '*');
        }

        System.out.println("palavra modificada:");

        for (String pala : palavra) {
            System.out.println(pala);
        }
    }
}
