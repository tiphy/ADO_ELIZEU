
import java.util.Scanner;

public class diferenca {
    public static void main(String[]args){
      Scanner ler = new Scanner(System.in);

      System.out.println("informe o primeiro numero");
      int numero1 = ler.nextInt();

      System.out.println("informe o segundo numero");
      int numero2 = ler.nextInt();

        if (numero1 > numero2){
            int diferenca1 = numero1 - numero2;
            System.out.println("A diferença entre os números é: " + diferenca1);
        }

        else if (numero2 > numero1){
            int diferenca2 = numero2 - numero1;
            System.out.println("A diferença entre os números é: " + diferenca2);
        }

        else {
            System.out.println("Os números são iguais");
        }


    }

}
