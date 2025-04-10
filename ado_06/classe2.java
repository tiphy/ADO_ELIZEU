import java.util.Scanner;


public class classe2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int itemMenu;
       
        double a, b, c, sp;


        OUTER:
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Executar");
            System.out.println("2 - Finalizar");
            System.out.print("Escolha uma opção: ");
            itemMenu = ler.nextInt();
            switch (itemMenu) {
                case 1 -> {
                    System.out.print("Digite o lado a: ");
                    a = ler.nextDouble();


                    System.out.print("Digite o lado b: ");
                    b = ler.nextDouble();


                    System.out.print("Digite o lado c: ");
                    c = ler.nextDouble();
                 
                    if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
                        sp = (a + b + c) / 2;
                       
                       
                        if (a == b && b == c) {
                            System.out.println("Triângulo Equilátero");
                        }
                        else if (a != b && b != c && a != c) {
                            System.out.println("Triângulo Escaleno");
                        }
                        else {
                            System.out.println("Triângulo Isósceles");
                        }
                       
                        System.out.println("Semiperímetro: " + sp);
                    }
                    else {
                        System.out.println("Erro: Lados inválidos!");
                    }  
                }
                case 2 -> {
                    System.out.println("Programa finalizado.");
                    break OUTER;
                }
                default -> System.out.println("Opção inválida!");
            }
        }


    }
}

