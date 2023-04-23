package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidemensioal {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int [4] [4];

        for(int i =0; i < M.length; i++){
            for(int J = 0; J < M[i].length; J++){
                M[i][J]= random.nextInt(9);

            }
        }

        System.out.print("Matriz: \n");
        for(int[] linha: M){
            for (int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
