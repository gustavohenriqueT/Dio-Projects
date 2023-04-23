package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex4_ImparPar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantsNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;


        System.out.println("Quantidade de números: ");
        quantsNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        }while(count < quantsNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);

    }
}
