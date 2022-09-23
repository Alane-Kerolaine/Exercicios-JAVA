import java.util.Scanner;

public class Ex_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int entrada1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int entrada2 = scan.nextInt();

        for (int x = entrada1 + 1; x < entrada2; x++){
            System.out.println(x);
        }
    }
}
