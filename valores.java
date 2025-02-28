import java.util.Scanner;

public class valores {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int multiplicacao;

        System.out.println("Informe um numero");
        int numeroUm = ler.nextInt();

        if (numeroUm < 0) {
            multiplicacao = numeroUm * -1;
            System.out.println(multiplicacao);
        } else {
            System.out.println(numeroUm);
        }
    }
}

