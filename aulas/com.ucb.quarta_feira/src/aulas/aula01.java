package aulas;

import java.util.Scanner;


public class aula01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       /*
        System.out.println("Digite seu nome: ");

        String nome = sc.nextLine();
        System.out.println("Seu nome: " + nome);

        */

        /* Exercicio 1
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
        */

        /* Exercicio 2
        float[] notas = new float[3];
        float media;
        System.out.println("Digite as notas para calcular a média aritmetica:  ");

        for (int i = 0; i < notas.length; i++)
        {
            notas[i] = sc.nextFloat();
        }

        media = (notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("valor da média: " + media);
        */

        /* Exercicio 3
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
        */

        /* Exercicio 4
        float salario;
        double aumento = 0.25;

        System.out.println("Digite o salário do colaborador: ");
            salario = sc.nextFloat();
            salario += salario*aumento;
        System.out.print(salario);
        */

        /* Exercicio 5
        float salario;
        float PercentualAumento;

        System.out.println("Digite a seguir o salário do colaborador, e a porcentagem de seu aumento (Ex: 50): ");

        salario = sc.nextFloat(); PercentualAumento = sc.nextInt();
        salario += salario * (PercentualAumento/100);

        System.out.print("Salário após o aumento: " + salario);
        */

        /* Exercicio 6
        float salario;
        float GratificacaoSalarial = 5;
        float imposto = 7;

        System.out.println("Digite o sálario do colaborador: ");
        salario = sc.nextFloat();

        salario += (salario * (GratificacaoSalarial / 100));
        salario -= salario * (imposto / 100);

        System.out.println("O salário com a gratificação, ja descontando os impostos é de: R$" + salario);
        */

    }
}