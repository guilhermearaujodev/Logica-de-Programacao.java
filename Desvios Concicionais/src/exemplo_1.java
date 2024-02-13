import java.util.Scanner;
// DESVIO SIMPLES
// Exemplo 1
// Dada uma venda, calcular e exibir o desconto de 10% caso a venda seja acima de 300 reais.
public class exemplo_1 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double venda, desconto;
        
        System.out.println("Digite o valor de venda: ");
        venda = entrada.nextDouble();

        if (venda > 300) {
            desconto = venda * 10 / 100;
            venda = venda - desconto;
        }
        System.out.println("Novo valor: " + venda);
    }
}