import java.util.Scanner;

public class Ex_boolean {

    public static boolean verificaImparOuPar(int num1){
        return num1 % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número:" );
        int entrada = scan.nextInt();

        System.out.println(verificaImparOuPar(entrada));
    }
}
