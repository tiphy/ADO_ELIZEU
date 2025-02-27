import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o seu nome:");
        String nome = ler.next();

        System.out.println("informe a sua altua:");
        double altura = ler.nextDouble();

        System.out.println("informe o seu peso");
        double peso = ler.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("peso normal");
        } else if (imc > 29.9) {
            System.out.println("sobrepeso");
        }


        System.out.println( nome + " está com o IMC de " + imc );

    }
}