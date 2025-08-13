package atv_classe_scanner;

import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercicio 1
        int[] a = new int[4];
        int soma = 0;

        System.out.printf("Digite 4 numeros (inteiros), para serem somados: ");
            for (int i = 0; i < a.length; i++)
            {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < a.length; i++)
            {
                soma += a[i];
            }

        System.out.println("Resultado: " + soma);
    }
}
