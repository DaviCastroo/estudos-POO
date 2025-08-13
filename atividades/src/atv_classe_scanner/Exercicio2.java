package atv_classe_scanner;

import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Exercicio 2
        float[] notas = new float[3];
        float media;
        System.out.println("Digite as notas para calcular a média aritmetica:  ");

        for (int i = 0; i < notas.length; i++)
        {
            notas[i] = sc.nextFloat();
        }

        media = (notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("valor da média: " + media);

    }
}
