import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("1.Dados do numero 1");
        System.out.println("2.Dados do numero 2");
        System.out.println("3.Imprimir os dois numeros");
        System.out.println("4.Soma");
        System.out.println("5.Subtração");
        System.out.println("6.Sair");
        int l = 1;
        while (l != 0) {
            System.out.println("Digite a operação desejada: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Numero 1: " + n1);
                    break;
                case 2:
                    System.out.println("Numero 2: " + n2);
                    break;
                case 3:
                    System.out.println("Numero 1: " + n1);
                    System.out.println("Numero 2: " + n2);
                    break;
                case 4:
                    System.out.println("Soma: " + (n1 + n2));
                    break;
                case 5:
                    System.out.println("Subtração: " + (n1 - n2));
                    break;
                case 6:
                    l = 0;
                    break;
            }
        }
    }
}