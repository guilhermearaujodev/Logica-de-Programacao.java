import java.util.Scanner;

//Funções com Parâmetros
//Criar uma função que retorne o maior entre dois números passados por parâmetros
public class exemplo_6 {
    public static int maior2n(int num1, int num2)
    {
        int maior;
        if (num1 > num2) {
            maior = num1;
        }
        else
        {
            maior = num2;
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite um número: ");
        n1 = teclado.nextInt();
        System.out.println("Digite outro número: ");
        n2 = teclado.nextInt();
        System.out.println("Maior número = " + maior2n(n1, n2));
    }
}
