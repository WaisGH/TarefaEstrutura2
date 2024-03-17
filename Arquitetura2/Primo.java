import java.util.Scanner;
public class Primo {
    public static void main(String[] args) {
        int b=0;
        while (b<3) {
        b += 1;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean primo = true;
        while (i < n) {
            if (n % i == 0) {
                primo = false;
            }
            i += 1;
        }
        if (primo) {
            System.out.println("primo");
        } else {
            System.out.println("não primo");
        }
        }
    }
}
