import java.util.Scanner;

public class poligonos{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        int areaQuadrado;   
        double areaPentagono;
    

        System.out.println("informe o número de lados do poligno:");
        int NumLados = ler.nextInt();

        System.out.println("informe a meedida dos lados do poligno:");
        int MedLado = ler.nextInt();

        if (NumLados == 3) {
            System.out.println("Informe os três lados do triângulo:");
            int a = ler.nextInt();
            int b = ler.nextInt();
            int c = ler.nextInt();

            int s = (a + b + c) / 2;

            double raiz = s * (s - a) * (s - b) * (s - c); 
            
            double  areaTriangulo = Math.sqrt(raiz);
            System.out.println("TRIANGULO " + areaTriangulo);
        }



        else if(NumLados == 4){
            areaQuadrado = MedLado * MedLado;
            System.out.println("QUADRADO " + areaQuadrado);
        }

        else if(NumLados == 5){
            double apotema = MedLado / (2 * Math.tan(Math.PI / 5)); 
            areaPentagono = (MedLado * apotema) / 2;
            System.out.println("PENTAGONO " + areaPentagono); 
        }

        else {
            System.out.println("POLIGNO NÃO IDENTIFICADO");
        }


    }
}
