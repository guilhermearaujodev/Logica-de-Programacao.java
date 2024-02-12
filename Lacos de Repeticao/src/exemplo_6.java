import java.util.Scanner;
//Laço Para
//Dados 10 números pelo usuário, somá-los e, no final, exibir a somatória.
public class exemplo_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float  i, num, soma = 0;
        System.out.println("Digite 10 números: ");

        for(i = 1; i <= 10; i++)
        {
            num = teclado.nextFloat();
            soma += num;
        }
        System.out.println("Somatória = " + soma);
    }
}
