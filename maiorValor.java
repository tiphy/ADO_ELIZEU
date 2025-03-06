
import java.util.Scanner;


public class maiorValor {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("informe o primeiro valor:");
        int valor1 = ler.nextInt();

        System.out.println("informe o segundo valor:");
        int valor2 = ler.nextInt();

        System.out.println("informe o terceiro valor:");
        int valor3 = ler.nextInt();

        if (valor1 > valor2 && valor1 > valor3){
            System.out.println(valor1);
        }
        
        else if (valor2 > valor1 && valor2 > valor3){
            System.out.println(valor2);
        }

        else if (valor3 > valor1 && valor3 > valor2){
            System.out.println(valor3);
        }

    }
    
}
