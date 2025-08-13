package atv_classe_scanner;

import java.util.Scanner;

public class Exercicio4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercicio 4
        float salario;
        double aumento = 0.25;

        System.out.println("Digite o salário do colaborador: ");
        salario = sc.nextFloat();
        salario += salario * aumento;
        System.out.print(salario);

    }
}
