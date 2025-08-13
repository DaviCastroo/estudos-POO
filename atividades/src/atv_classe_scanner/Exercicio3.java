package atv_classe_scanner;

import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Exercicio 3

        float [] notas = new float [3];
        float [] pesos = new float [3];
        float mPonderada = 0 ;

        System.out.println("Digite a seguir as notas, com seus respectivos pesos: ");

        for (int i = 0; i < notas.length; i++)
        {
            notas[i] = sc.nextFloat();
            pesos[i] = sc.nextFloat();
        }
        for (int i = 0; i < notas.length; i++)
        {
            mPonderada += notas[i] * pesos[i];
        }
            mPonderada = mPonderada/ notas.length;

        System.out.println("Média ponderada: " + mPonderada);

    }
}
