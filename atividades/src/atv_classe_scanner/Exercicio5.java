package atv_classe_scanner;

import java.util.Scanner;

public class Exercicio5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercicio 5
        float salario;
        float PercentualAumento;

        System.out.println("Digite a seguir o salário do colaborador, e a porcentagem de seu aumento (Ex: 50): ");

        salario = sc.nextFloat();
        PercentualAumento = sc.nextInt();
        salario += salario * (PercentualAumento / 100);

        System.out.print("Salário após o aumento: " + salario);

    }
}
