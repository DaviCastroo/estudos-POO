package atv_classe_scanner;

import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Exercicio 6
        float salario;
        float GratificacaoSalarial = 5;
        float imposto = 7;

        System.out.println("Digite o sálario do colaborador: ");
        salario = sc.nextFloat();

        salario += (salario * (GratificacaoSalarial / 100));
        salario -= salario * (imposto / 100);

        System.out.println("O salário com a gratificação, ja descontando os impostos é de: R$" + salario);

    }
}
