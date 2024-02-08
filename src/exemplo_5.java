import java.util.Scanner;

//Dado um número pelo usuário, exibir o dia da semana correspondente.
public class exemplo_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Digite um número: ");
        n = entrada.nextInt();
        //Desvio encadeado exibe o dia da semana de acordo com o valor númerico digitado.
        if (n == 1)
            System.out.println("Domingo");
        else if (n == 2)
            System.out.println("Segunda-feira");
        else if (n == 3)
            System.out.println("Terça-feira");
        else if (n == 4)
            System.out.println("Quarta-feira");
        else if (n == 5)
            System.out.println("Quinta-feira");
        else if (n == 6)
            System.out.println("Sexta-feira");
        else if (n == 7)
            System.out.println("Sábado");
        else
            System.out.println("Dia inválido");
        }
    }