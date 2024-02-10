import java.util.Scanner;
//DESVIO ENCADEADO

// Dado o salário do funcionário, calcular o imposto de renda e o salário líquido de acordo com os seguintes critérios:
// 1- Salário até 1900 insento - 0%
// 2- Salário entre 1900.01 e 2800 - 15%
// 3- Salário acima de 2800.01 - 27,5%
// else = Senão
// if = Se
public class exemplo_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sal, imposto_renda, sal_liquido;

        System.out.println("Digite o seu salário: ");
        sal = entrada.nextDouble();

        if (sal <= 1900) {
            imposto_renda = 0;
        }
        else if (sal <= 2800) {
            imposto_renda = sal * 0.15;
        }
        else
        {
            imposto_renda = sal * 0.275;
        }

        sal_liquido = sal - imposto_renda;

        System.out.println("Imposto de renda: " + imposto_renda);
        System.out.println("Salário líquido: " + sal_liquido);
    }
}
