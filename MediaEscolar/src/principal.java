import java.util.Scanner;

public class principal {

    public static double calculaMedia (double nota1, double nota2, double nota3, double nota4){
       double media = nota1 + nota2 + nota3 + nota4 / 4;
       return media;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INSIRA AS NOTAS: ");
        System.out.println("1º unidade: ");
        double nota1 = scan.nextDouble();
        System.out.println("2º unidade: ");
        double nota2 = scan.nextDouble();
        System.out.println("3º unidade: ");
        double nota3 = scan.nextDouble();
        System.out.println("4º unidade: ");
        double nota4 = scan.nextDouble();

        double media = calculaMedia(nota1, nota2, nota3, nota4);

        System.out.println("-------BOLETIM-------");
        System.out.println("1º unidade: " + nota1);
        System.out.println("2º unidade: " + nota2);
        System.out.println("3º unidade: " + nota3);
        System.out.println("4º unidade: " + nota4);
        System.out.println("Média: " + media);

        if (media >= 7){
            System.out.println("ALUNO APROVADO!");
        } else if (media >=5 && media < 7) {
            System.out.println("ALUNO EM RECUPERAÇÃO.");
        }else{
            System.out.println("ALUNO REPROVADO.");
        }

        System.out.println("---------------------");
    }
}
