import java.util.Scanner;

//Laço Enquanto-faça
//Fazer um algoritmo que leia e some diversos números dados pelo usuário.
// Quando o usuário digitar 0, finaliza o algoritimo. No final, exibe a soma resultante.
public class exemplo_2 {
    public static void main(String[] args) {
        //Estancia o objeto Teclado para ler variáveis
        Scanner teclado = new Scanner(System.in);

        float num = 1, soma = 0;

        System.out.println("Digite 0 para finalizar: ");

        while(num != 0){
            System.out.println("Digite um número: ");
            num = teclado.nextFloat();
            soma += num;
        }

        System.out.println("Somatória = " + soma);
    }
}
