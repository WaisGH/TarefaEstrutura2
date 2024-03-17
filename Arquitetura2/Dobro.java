import java.util.Scanner;
public class Dobro {
    public static void main(String[] args) {
        int b=0;
        while (b<3) {
        b += 1;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * 2);
        }
    }
}
