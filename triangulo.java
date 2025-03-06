/*  Escreva um programa que leia o valor de 3 lados inteiros positivos (A,B e C) de um triângulo.
No início do programa compare os lados para saber se é uma figura de três lados apenas ou se é um
triângulo, Se qualquer um dos lados for maior ou igual a soma dos outros dois então a figura não é um
triângulo. SE ( A >= (B+ C) ou B >=(A+C) ou C >= (B+A) ). Se for um triângulo, descubra o TIPO de
triângulo: “equilátero”, “escaleno” ou “isósceles”. Imprima ao final o TIPO de triângulo. Verifique na
internet para saber como identificar o TIPO de triângulo.


valor de A, B e C
se A >= (B + C) ou B >= (A + C) ou C >= (A + B)  

se a soma de A, B e C for d 180 = triângulo
se nao = nao é triangulo 

equilatero = todos os lados iguais
escaleno = todos os lados diferentes
isósceles = dois lados iguais e um diferente

 */ 

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


        

