import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = ler.nextDouble();

        System.out.print("Digite o número de faltas: ");
        int faltas = ler.nextInt();

 
        double mediaGeometrica = Math.sqrt(nota1 * nota2);


        if (faltas > 20) {
            System.out.println("Reprovado por faltas");

        } else if (mediaGeometrica < 3) {
            System.out.println(mediaGeometrica + "Reprovado por notas");

        } else if (mediaGeometrica >= 3 && mediaGeometrica < 5) {
            System.out.println(mediaGeometrica + "Aluno de Recuperação");

        } else if (mediaGeometrica >= 5 && mediaGeometrica < 6) {
            System.out.println(mediaGeometrica + "Aluno de Exame");

        } else if (mediaGeometrica >= 6) {
            System.out.println(mediaGeometrica + "Aluno Aprovado");
        }

    }
}


