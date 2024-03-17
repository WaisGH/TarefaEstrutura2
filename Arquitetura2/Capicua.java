import java.util.Scanner;
public class Capicua {
    public static void main(String[] args) {
        int b=0;
        while (b<3) {
        b += 1;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n;
        int r = 0;
        while (n2 > 0) {
            r = r * 10 + n2 % 10;
            n2 = n2 / 10;
        }
        if (n == r) {
            System.out.println("capicua");
        } else {
            System.out.println("não capicua");
        }
        }
    }
}
