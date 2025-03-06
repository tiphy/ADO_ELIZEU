import java.util.Scanner;
public class triangulo{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        int a = ler.nextInt();

        System.out.println("Informe o valor de B:");
        int b = ler.nextInt();

        System.out.println("Informe o valor de C:");
        int c = ler.nextInt();

        if(a + b + c != 180){
            System.out.println("Não é um triângulo");
            } else if (a == b && b == c){
                System.out.println("Triângulo Equilátero");
            } else if (a != b && b != c && a != c){
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
                    }
                }
            }


        

