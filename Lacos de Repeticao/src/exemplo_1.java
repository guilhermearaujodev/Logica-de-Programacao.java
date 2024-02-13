import java.util.Scanner;
//Laço Pré-condicional
//Solicitar ao usuário que digite S para sim ou N para não obrigatoriamente.
//Se digitar uma letra que não for S ou N, realizar a repetição.
//while = enquanto
//! = negação (depende da maneira que for usada)
public class exemplo_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao;

        System.out.println("Digite [S]im ou [N]ão: ");
        opcao = entrada.next();

        while(!(opcao.equals("s") || opcao.equals("S") || opcao.equals("n") || opcao.equals("N")))
        {
            System.out.println("Você digitou " + opcao + " digite S ou N!");

            System.out.println("Digite [S]im ou [N]ão: ");
            opcao = entrada.next();
        }
        System.out.println("Você digitou " + opcao);

    }
}
